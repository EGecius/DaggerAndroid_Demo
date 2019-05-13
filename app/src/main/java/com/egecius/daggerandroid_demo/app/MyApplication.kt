package com.egecius.daggerandroid_demo.app

import android.app.Activity
import android.app.Application
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import javax.inject.Inject

class MyApplication : Application(),
    CoreComponentProvider,
    HasActivityInjector {

    @Inject
    lateinit var activityInjector:
            DispatchingAndroidInjector<Activity>

    private lateinit var coreComponent: CoreComponent
    override fun onCreate() {
        super.onCreate()
        DaggerAppComponent
            .builder()
            .coreComponent(provideCoreComponent())
            .build()
            .inject(this)
    }
    override fun activityInjector(): AndroidInjector<Activity> =
        activityInjector

    override fun provideCoreComponent(): CoreComponent {
        if (!this::coreComponent.isInitialized) {
            coreComponent = DaggerCoreComponent
                .builder()
                .build()
        }
        return coreComponent
    }
}