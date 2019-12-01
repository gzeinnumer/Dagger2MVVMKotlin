package com.gzeinnumer.dagger2mvvmkotlin

import androidx.lifecycle.ViewModelProvider
import com.gzeinnumer.dagger2mvvmkotlin.factory.MyViewModelFactory
import dagger.Binds
import dagger.Module

//todo 7
@Module
abstract class MyModule{
    @Binds
    abstract fun bindViewModelFactory(factory: MyViewModelFactory):ViewModelProvider.Factory
}