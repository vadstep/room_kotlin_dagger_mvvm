package com.example.vadstep.roomwordsample.di

import com.example.vadstep.roomwordsample.mvvm.ViewModelModule
import com.example.vadstep.roomwordsample.db.WordRoomDBModule
import com.example.vadstep.roomwordsample.repo.RepositoryModule
import dagger.Module


/**
 * Created by User1 on 04/02/2018.
 */

@Module(includes = arrayOf(WordRoomDBModule::class, RepositoryModule::class, ViewModelModule::class))
class AppModule() {

}