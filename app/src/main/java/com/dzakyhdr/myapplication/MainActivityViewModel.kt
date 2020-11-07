package com.dzakyhdr.myapplication

import androidx.databinding.Bindable
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel(startingTotal: Int) : ViewModel() {

    private var total = MutableLiveData<Int>()
    val totalData: LiveData<Int>
        get() = total

    val inputText = MutableLiveData<String>()

    init {
        total.value = startingTotal
    }

    fun setTotal() {
        val inputInt: Int = inputText.value!!.toInt()
        total.value = (total.value)?.plus(inputInt)
    }


}