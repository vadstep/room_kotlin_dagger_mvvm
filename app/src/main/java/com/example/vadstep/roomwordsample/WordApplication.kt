package com.example.vadstep.roomwordsample

import android.app.Activity
import android.app.Application
import com.example.vadstep.roomwordsample.di.AppModule
import com.example.vadstep.roomwordsample.di.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import javax.inject.Inject



/**
 * Created by User1 on 04/02/2018.
 */
class WordApplication : Application(), HasActivityInjector {
    @Inject
    lateinit var activityInjector: DispatchingAndroidInjector<Activity>

    override fun onCreate() {
        super.onCreate()
        DaggerAppComponent.builder()
                .application(this)
                .build()
                .inject(this);
    }
    override fun activityInjector(): AndroidInjector<Activity> = activityInjector
}