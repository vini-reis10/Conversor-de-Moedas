package br.com.vinireis.conversordemoedas.model

interface IObserver {
    fun updateUI(data:MutableMap<String,Any>)
}