package com.example.vadstep.roomwordsample.di

import com.example.vadstep.roomwordsample.WordApplication
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton


/**
 * Created by User1 on 04/02/2018.
 */


@Singleton
@Component(modules = [
    AndroidSupportInjectionModule::class,
    BuildersModule::class
])
interface AppComponent : AndroidInjector<WordApplication> {
    
    override fun inject(app: WordApplication)
}