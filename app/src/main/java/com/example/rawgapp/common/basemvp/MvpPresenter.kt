package com.example.rawgapp.common.basemvp

interface MvpPresenter<V : MvpView> {
    fun attach(view: V)
    fun detach()
}