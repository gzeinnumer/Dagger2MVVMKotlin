package com.gzeinnumer.dagger2mvvmkotlin.factory

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.gzeinnumer.dagger2mvvmkotlin.viewmodels.MyViewModel
import javax.inject.Inject
import javax.inject.Provider

//todo 6
class MyViewModelFactory
@Inject
constructor(private val myModelProvider: Provider<MyViewModel>) : ViewModelProvider.Factory {
    @Suppress("UNCHEKED_CAST")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return myModelProvider.get() as T
    }
}