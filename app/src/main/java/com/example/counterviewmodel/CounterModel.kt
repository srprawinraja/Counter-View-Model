package com.example.counterviewmodel
data class CounterModel(var count: Int)
class CounterRepository{
    private val _data = CounterModel(0)
    fun increment(){
        _data.count++
    }
    fun decrement() {
        _data.count--
    }
    fun getCounters() =_data
}
