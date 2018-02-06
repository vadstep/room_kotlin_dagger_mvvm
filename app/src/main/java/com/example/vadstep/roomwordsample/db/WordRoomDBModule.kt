package com.example.vadstep.roomwordsample.db

import android.app.Application
import android.arch.persistence.room.Room
import com.example.vadstep.roomwordsample.repo.WordRepository
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by User1 on 05/02/2018.
 */
@Module
class WordRoomDBModule() {


    @Singleton
    @Provides
    internal fun providesRoomDatabase(mApplication: Application): WordRoomDatabase {
        return Room.databaseBuilder(mApplication, WordRoomDatabase::class.java, "word_database").build()
    }

    @Singleton
    @Provides
    internal fun providesProductDao(demoDatabase: WordRoomDatabase): WordDao {
        return demoDatabase.wordDao()
    }

}