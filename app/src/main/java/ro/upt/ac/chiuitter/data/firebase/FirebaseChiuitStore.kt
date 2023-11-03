package ro.upt.ac.chiuitter.data.firebase

import android.util.Log
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener
import com.google.firebase.database.getValue
import kotlinx.coroutines.channels.awaitClose
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.callbackFlow
import ro.upt.ac.chiuitter.domain.Chiuit
import ro.upt.ac.chiuitter.domain.ChiuitRepository
class FirebaseChiuitStore : ChiuitRepository {

    private val database = FirebaseDatabase.getInstance().reference.child("chiuits")

    override fun getAll(): Flow<List<Chiuit>> = callbackFlow {
        val listener = object : ValueEventListener {
            override fun onCancelled(p0: DatabaseError) {
                Log.e("FirebaseChiuitStore", "getAll:", p0.toException())
            }

            override fun onDataChange(p0: DataSnapshot) {
                val nodeValues = mutableListOf<ChiuitNode>()

                val children = p0.children
                // TODO 15: Iterate through the children, get the node value and
                //  add it to nodeValues.

                for (child in children) {
                    val timestamp = child.child("timestamp").getValue(Long::class.java)
                    val description = child.child("description").getValue(String::class.java)
                    val chiuitNode = ChiuitNode(timestamp ?: 0, description ?: "")
                    nodeValues.add(chiuitNode)
                    println("CHILD IS $child")
                }

                val items = nodeValues.map { chiuitNode -> chiuitNode.toDomainModel() }
                println("RETRIEVED FROM FIREBASE")
                trySend(items)
            }

        }
        database.addValueEventListener(listener) // AICI ERA GRESIT, trebuie database.addValueEventListener(listener) in loc de  database.addListenerForSingleValueEvent(listener)

        awaitClose { database.removeEventListener(listener) }
    }

    override fun addChiuit(chiuit: Chiuit) {
        // TODO 16: Insert the object into database - don't forget to use the right model.
        println("ADDED TO FIREBASE")
        var database = FirebaseDatabase.getInstance().reference
        val chiuitsRef = database.child("chiuits").push()

        // Set the value of the newly generated child node
        chiuitsRef.setValue(chiuit.toFirebaseModel())
            .addOnSuccessListener {
                println("Chiuit added to Firebase")
            }
            .addOnFailureListener { e ->
                println("Error adding chiuit to Firebase: $e")
            }
    }

    override fun removeChiuit(chiuit: Chiuit) {
        database.addListenerForSingleValueEvent(object : ValueEventListener {
            override fun onCancelled(p0: DatabaseError) {
                database.removeEventListener(this)
                Log.e("FirebaseChiuitStore", "removeChiuit:", p0.toException())
            }

            override fun onDataChange(p0: DataSnapshot) {
                val children = p0.children
                var database = FirebaseDatabase.getInstance().reference.child("chiuits")
                // TODO 17: Iterate through the children and find the matching node,
                //  then perform the removal.
                for (child in children) {
                    if(child.getValue(ChiuitNode::class.java)!=null && child.getValue(ChiuitNode::class.java) == chiuit.toFirebaseModel()) {
                        val chiuitRef = database.child(child.key.toString())
                        chiuitRef.removeValue()
                    }
                }

                database.removeEventListener(this)
            }
        })
    }

    fun Chiuit.toFirebaseModel(): ChiuitNode {
        return ChiuitNode(timestamp, description)
    }

    fun ChiuitNode.toDomainModel(): Chiuit {
        return Chiuit(timestamp, description)
    }

}