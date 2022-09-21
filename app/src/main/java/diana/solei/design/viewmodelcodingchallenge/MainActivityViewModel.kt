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


    val inputText = MutableLiveData<String>()

    init {
        totalMutable.value = startingTotal
    }

    fun increaseCounter(input: Int) {
        totalMutable.value = (totalMutable.value)?.plus(input)
    }

    fun increaseCounterByOne() {
        val inputText:Int = inputText.value!!.toInt()
        totalMutable.value = (totalMutable.value)?.plus(inputText)
    }
}