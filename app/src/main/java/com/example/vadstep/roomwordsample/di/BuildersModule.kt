package com.example.vadstep.roomwordsample.di

import com.example.vadstep.roomwordsample.ui.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector


/**
 * Created by User1 on 05/02/2018.
 */
@Module(includes = arrayOf(RoomModule::class,ViewModelModule::class))
abstract class BuildersModule {
//
//    @ContributesAndroidInjector
//    internal abstract fun bindMainActivity(): MainActivity

     //Add bindings for other sub-components here
}