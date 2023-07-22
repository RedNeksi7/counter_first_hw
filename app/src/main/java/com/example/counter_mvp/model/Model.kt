package com.example.counter_mvp.model

class Model {

    var counter = 0
    var themeIsDark = false

    fun increment() {
        counter++
    }

    fun decrement() {
        counter--
    }
}