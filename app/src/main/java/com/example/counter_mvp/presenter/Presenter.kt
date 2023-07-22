package com.example.counter_mvp.presenter

import com.example.counter_mvp.view.CounterView
import com.example.counter_mvp.Injector

class Presenter(var view: CounterView) {

    var model = Injector.getModel()

    fun increment() {
        model.increment()
        view.showCount(model.counter)
        if (model.counter == 10) {
            view.showToast("Поздравляю!")
        }
        if (model.counter == 15) {
            view.setGreenColor()
        }
    }

    fun decrement() {
        model.decrement()
        view.showCount(model.counter)
        if (model.counter == 10) {
            view.showToast("Поздравляю!")
        }
        if (model.counter == 15) {
            view.setGreenColor()
        }
    }

    fun theme() {
        if (model.themeIsDark) {
            view.lightTheme()
            model.themeIsDark = false
        } else {
            view.darkTheme()
            model.themeIsDark = true
        }
    }
}