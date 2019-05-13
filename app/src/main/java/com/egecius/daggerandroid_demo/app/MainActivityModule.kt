package com.egecius.daggerandroid_demo.app

import com.egecius.daggerandroid_demo.MainActivity
import dagger.Binds
import dagger.Module
import dagger.android.AndroidInjector
import dagger.multibindings.ClassKey
import dagger.multibindings.IntoMap

@Module(subcomponents = [MainActivitySubcomponent::class])
abstract class MainActivityModule {
    @Binds
    @IntoMap
    @ClassKey(MainActivity::class)
    internal abstract fun bindMainActivityInjectorFactory(
        builder: MainActivitySubcomponent.Builder
    ): AndroidInjector.Factory<*>
}