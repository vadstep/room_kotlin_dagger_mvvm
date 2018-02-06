package com.example.vadstep.roomwordsample.db

import android.arch.lifecycle.LiveData
import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.OnConflictStrategy.REPLACE
import android.arch.persistence.room.Query
import com.example.vadstep.roomwordsample.models.Word

/**
 * Created by User1 on 04/02/2018.
 */
@Dao
interface WordDao {
    @Insert(onConflict = REPLACE)
    fun insert(word: Word)

    @Query("DELETE from word_table")
    fun deleteAll()

    @Query("DELETE from word_table where id IN (SELECT id from word_table limit 1)")
    fun deleteOne()

    @Query("SELECT * from word_table ORDER BY word ASC")
    fun getAllWords(): LiveData<List<Word>>
}