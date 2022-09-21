package diana.solei.design.viewmodelcodingchallenge

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel(startingTotal: Int): ViewModel() {
    private var counter: Int = 0

    var totalMutable = MutableLiveData<Int>()

    init {
        totalMutable.value = startingTotal
    }

    fun increaseCounter(input: Int) {
        totalMutable.value = (totalMutable.value)?.plus(input)
    }
}