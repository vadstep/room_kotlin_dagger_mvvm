package com.example.vadstep.roomwordsample.db

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import com.example.vadstep.roomwordsample.models.Word






/**
 * Created by User1 on 04/02/2018.
 */
@Database(entities = arrayOf(Word::class), version = 1)
abstract class WordRoomDatabase : RoomDatabase() {

    abstract fun wordDao(): WordDao

}
