package com.example.counterviewmodel

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableIntStateOf
import androidx.lifecycle.ViewModel

class CounterViewModel:ViewModel() {
    private var repository=CounterRepository()
    private val _count = mutableIntStateOf(repository.getCounters().count)
    val count : MutableState<Int> = _count
    fun increment(){
       repository.increment()
        _count.intValue=repository.getCounters().count
    }
    fun decrement(){
        repository.decrement()
        _count.intValue=repository.getCounters().count

    }

}