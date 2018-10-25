@file:Suppress("DEPRECATION")

package ro.upt.ac.chiuitter.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.experimental.launch
import ro.upt.ac.chiuitter.data.ChiuitRepository
import ro.upt.ac.chiuitter.domain.Chiuit

class HomeViewModel(private val chiuitRepository: ChiuitRepository) : ViewModel() {

    val chiuitsLiveData = MutableLiveData<List<Chiuit>>()

    fun fetchChiuits() {
        launch {
            val chiuits = chiuitRepository.getAll()
            chiuitsLiveData.postValue(chiuits)
        }
    }

    fun addChiuit(description: String) {
        launch {
            chiuitRepository.addChiuit(Chiuit(System.currentTimeMillis(), description))
            fetchChiuits()
        }
    }

    fun removeChiuit(chiuit: Chiuit) {
        launch {
            chiuitRepository.removeChiuit(chiuit)
            fetchChiuits()
        }
    }

}