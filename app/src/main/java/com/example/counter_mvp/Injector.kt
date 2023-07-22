package com.example.counter_mvp

import com.example.counter_mvp.model.Model
import com.example.counter_mvp.presenter.Presenter
import com.example.counter_mvp.view.CounterView

class Injector {

    companion object {
        fun getModel() = Model()
        fun getPresenter(view: CounterView) = Presenter(view)
    }
}