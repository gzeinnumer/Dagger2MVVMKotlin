package com.gzeinnumer.dagger2mvvmkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.gzeinnumer.dagger2mvvmkotlin.viewmodels.MyViewModel
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    //todo 10
    @Inject
    lateinit var factory: ViewModelProvider.Factory
    lateinit var myViewModel: MyViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //todo 11
        DaggerMyComponent.create().inject(this)
        myViewModel = ViewModelProviders.of(this, factory).get(MyViewModel::class.java)

        myViewModel.getDataViewModel()

//        text_tv.text = myViewModel.getDataViewModel()

        //todo 12 try to run

        //todo 15
        //comment         text_tv.text = myViewModel.getDataViewModel()

        //todo 16
        myViewModel.callLiveData()
        myViewModel.getMyLiveData().observe(this, Observer {
            text_tv.text = it
        })
    }
}
