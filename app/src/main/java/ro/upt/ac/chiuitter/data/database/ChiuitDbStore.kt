package ro.upt.ac.chiuitter.data.database

import ro.upt.ac.chiuitter.domain.Chiuit
import ro.upt.ac.chiuitter.domain.ChiuitRepository

class ChiuitDbStore(private val appDatabase: AppDatabase) : ChiuitRepository {

    override fun getAll(): List<Chiuit> {
        return appDatabase.chiuitDao().getAll().map { it.toDomainModel() }
    }

    override fun addChiuit(chiuit: Chiuit) {
        // TODO 10: Add the new chiuit by invoking the DAO; make sure to use the designated mapper.
        appDatabase.chiuitDao().addChiuit(chiuit.toDbModel())
    }

    override fun removeChiuit(chiuit: Chiuit) {
        // TODO 13: Remove the chiuit by invoking the DAO; make sure to use the designated mapper.
        appDatabase.chiuitDao().removeChiuit(chiuit.toDbModel())
    }


    private fun Chiuit.toDbModel() = ChiuitEntity(timestamp, description)

    private fun ChiuitEntity.toDomainModel() = Chiuit(timestamp, description)

}