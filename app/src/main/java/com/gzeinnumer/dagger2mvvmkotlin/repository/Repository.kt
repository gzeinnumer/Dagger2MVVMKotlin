package com.gzeinnumer.dagger2mvvmkotlin.repository

import androidx.lifecycle.MutableLiveData
import javax.inject.Inject

//todo 4
class Repository @Inject constructor(){
    fun getData(): String{
        return "This is dagger MVVM Kotlin"
    }

    //todo 13
    val mutableLiveData = MutableLiveData<String>()

    fun setMutableLiveData(){
        mutableLiveData.value = "This is LiveData Dagger "
    }

    fun getMyLiveData(): MutableLiveData<String>{
        return mutableLiveData
    }
}