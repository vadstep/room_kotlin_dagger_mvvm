package com.example.vadstep.roomwordsample.di

import android.app.Application
import com.example.vadstep.roomwordsample.WordApplication
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton
import dagger.android.AndroidInjectionModule




/**
 * Created by User1 on 04/02/2018.
 */


@Singleton
@Component(modules = arrayOf(AndroidInjectionModule::class,
        AppModule::class,
        ActivityModule::class))
interface AppComponent {
    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder

        fun build(): AppComponent
    }

    fun inject(githubApp: WordApplication)
}