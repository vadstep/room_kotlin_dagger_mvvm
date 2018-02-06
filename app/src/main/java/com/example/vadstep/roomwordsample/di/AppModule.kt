package com.example.vadstep.roomwordsample.di

import android.app.Application
import android.content.Context
import com.example.vadstep.roomwordsample.WordApplication
import dagger.Binds
import dagger.Module
import dagger.Provides
import javax.inject.Singleton


/**
 * Created by User1 on 04/02/2018.
 */
@Module
abstract class AppModule {

    @Binds
    abstract fun provideApplication(application: WordApplication) :Application

}