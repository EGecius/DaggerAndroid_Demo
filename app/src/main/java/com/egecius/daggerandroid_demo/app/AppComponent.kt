package com.egecius.daggerandroid_demo.app

import dagger.Component
import dagger.android.AndroidInjectionModule

@Component(modules = [AndroidInjectionModule::class,
    AppModule::class,
    MainActivityModule::class],
    dependencies = [CoreComponent::class])
@AppScope
interface AppComponent {
    fun inject(application: MyApplication)
}