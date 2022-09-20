package diana.solei.design.viewmodelcodingchallenge

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class MainActivityViewModelFactory(private val startingTotal: Int): ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
    if (modelClass.isAssignableFrom(MainActivityViewModel::class.java)) {
        return MainActivityViewModel(startingTotal) as T
    }
        throw IllegalArgumentException("UnKnown View Model Class")
    //        return super.create(modelClass)
    }
}