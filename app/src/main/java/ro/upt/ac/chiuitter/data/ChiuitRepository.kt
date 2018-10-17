package ro.upt.ac.chiuitter.data

import ro.upt.ac.chiuitter.domain.Chiuit

interface ChiuitRepository {
    fun getAll() : List<Chiuit>
    fun addChiuit(chiuit: Chiuit)
    fun removeChiuit(chiuit: Chiuit)
}