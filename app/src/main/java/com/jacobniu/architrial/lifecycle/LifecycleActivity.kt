package com.jacobniu.architrial.lifecycle

import android.arch.lifecycle.LifecycleObserver
import android.os.Bundle
import android.support.v7.app.AppCompatActivity

/**
 * @author ajayniu
 * @since 2019-01-29
 */
class LifecycleActivity : AppCompatActivity() {

    private lateinit var presenter: LifecyclePresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        presenter = LifecyclePresenter()
        lifecycle.addObserver(presenter as LifecycleObserver)
    }
}