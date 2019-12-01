package com.gzeinnumer.dagger2mvvmkotlin

import dagger.Component

//todo 8
@Component(modules = [MyModule::class])
interface MyComponent {
    fun inject(activity: MainActivity)
}
//todo 9 rebuild