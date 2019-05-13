package com.egecius.daggerandroid_demo.app

import com.egecius.daggerandroid_demo.MainActivity
import dagger.Subcomponent
import dagger.android.AndroidInjector

@Subcomponent
interface MainActivitySubcomponent: AndroidInjector<MainActivity> {
    @Subcomponent.Builder
    abstract class Builder: AndroidInjector.Builder<MainActivity>()
}