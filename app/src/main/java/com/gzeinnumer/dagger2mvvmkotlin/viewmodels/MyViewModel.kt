package com.gzeinnumer.dagger2mvvmkotlin.viewmodels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.gzeinnumer.dagger2mvvmkotlin.repository.Repository
import javax.inject.Inject

//todo 5
class MyViewModel @Inject constructor(private val repository: Repository): ViewModel(){
    fun getDataViewModel() : String{
        val myDaggerName = repository.getData()
        return myDaggerName
    }

    //todo 14
    var resultData = MutableLiveData<String>()

    fun callLiveData(){
        repository.setMutableLiveData()
    }

    fun getMyLiveData(): MutableLiveData<String>{
        resultData = repository.getMyLiveData()
        return resultData
    }

}