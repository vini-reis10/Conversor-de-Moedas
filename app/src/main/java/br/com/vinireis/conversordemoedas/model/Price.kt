package br.com.vinireis.conversordemoedas.model

import androidx.databinding.ObservableDouble

class Price {
    private var value = ObservableDouble()

    fun getValue() = this.value.get()

    fun setValue(value:Double){
        this.value.set(value)
    }
 }