package ro.upt.ac.chiuitter.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import ro.upt.ac.chiuitter.data.ChiuitRepository
import ro.upt.ac.chiuitter.domain.Chiuit

class HomeViewModel(private val chiuitRepository: ChiuitRepository) : ViewModel() {

    val chiuitsLiveData = MutableLiveData<List<Chiuit>>()

    fun fetchChiuits() {
        val chiuits = chiuitRepository.getAll()
        chiuitsLiveData.postValue(chiuits)
    }

    fun addChiuit(description: String) {
        chiuitRepository.addChiuit(Chiuit(System.currentTimeMillis(), description))
        fetchChiuits()
    }

    fun removeChiuit(chiuit: Chiuit) {
        chiuitRepository.removeChiuit(chiuit)
        fetchChiuits()
    }

}