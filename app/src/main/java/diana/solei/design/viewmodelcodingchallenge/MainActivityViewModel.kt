package diana.solei.design.viewmodelcodingchallenge

import androidx.lifecycle.ViewModel

class MainActivityViewModel(startingTotal: Int): ViewModel() {
    private var counter: Int = 0

    init {
        counter = startingTotal
    }

    fun getCounter():Int {
        return counter
    }
    fun increaseCounter(input: Int) {
        counter += input
    }
}