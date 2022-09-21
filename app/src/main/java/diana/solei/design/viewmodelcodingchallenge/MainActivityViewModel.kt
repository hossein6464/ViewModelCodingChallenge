package diana.solei.design.viewmodelcodingchallenge

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel(startingTotal: Int): ViewModel() {
    private var counter: Int = 0
    // Change To Private
    private var totalMutable = MutableLiveData<Int>()
    // Adding a Live Data
    val totalLiveData : LiveData<Int>
    get() = totalMutable

    init {
        totalMutable.value = startingTotal
    }

    fun increaseCounter(input: Int) {
        totalMutable.value = (totalMutable.value)?.plus(input)
    }

    fun increaseCounterByOne() {
        totalMutable.value = (totalMutable.value)?.plus(1)
    }
}