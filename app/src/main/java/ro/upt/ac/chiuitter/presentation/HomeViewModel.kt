package ro.upt.ac.chiuitter.presentation

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import ro.upt.ac.chiuitter.domain.Chiuit
import ro.upt.ac.chiuitter.domain.ChiuitRepository

class HomeViewModel(private val chiuitRepository: ChiuitRepository) : ViewModel() {

    private val _chiuitListState = MutableStateFlow(chiuitRepository.getAll())
    val chiuitListState: StateFlow<List<Chiuit>> = _chiuitListState.asStateFlow()

    private fun retrieveChiuits() {
        _chiuitListState.value = chiuitRepository.getAll()
    }

    fun addChiuit(description: String) {
        chiuitRepository.addChiuit(Chiuit(System.currentTimeMillis(), description))
        retrieveChiuits()
    }

    fun removeChiuit(chiuit: Chiuit) {
        chiuitRepository.removeChiuit(chiuit)
        retrieveChiuits()
    }

}