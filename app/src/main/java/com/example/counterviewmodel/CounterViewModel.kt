package com.example.counterviewmodel

import android.util.Log
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableIntStateOf
import androidx.lifecycle.ViewModel

class CounterViewModel:ViewModel() {
    private val _count = mutableIntStateOf(0)
    val count : MutableState<Int> = _count
    fun increment(){
        _count.intValue+=1
        Log.i("prawin", count.value.toString())
    }
    fun decrement(){
        _count.intValue-=1
    }

}