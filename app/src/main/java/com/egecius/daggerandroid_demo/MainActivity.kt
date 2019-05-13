package com.egecius.daggerandroid_demo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import dagger.android.AndroidInjection
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var expensiveObject: ExpensiveObject

    @Inject
    lateinit var otherObject: OtherObject

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
