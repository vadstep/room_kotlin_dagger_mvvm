package com.example.vadstep.roomwordsample.di

import android.app.Application
import com.example.vadstep.roomwordsample.WordApplication
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton
import dagger.android.AndroidInjectionModule




/**
 * Created by User1 on 04/02/2018.
 */


@Component(modules = arrayOf(AndroidInjectionModule::class, AppModule::class, BuildersModule::class))
interface AppComponent {

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder

        fun build(): AppComponent
    }

    fun inject(app: WordApplication)
}