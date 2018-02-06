package com.example.vadstep.roomwordsample.models

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

/**
 * Created by User1 on 04/02/2018.
 */
@Entity(tableName = "word_table")
data class Word(@ColumnInfo(name = "word") val word: String){
    @ColumnInfo(name = "id")
    @PrimaryKey(autoGenerate = true) var id: Int = 0
}


private val ALPHA_NUMERIC_STRING = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789"
fun randomAlphaNumeric(count: Int): String {
    var count = count
    val builder = StringBuilder()
    while (count-- != 0) {
        val character = (Math.random() * ALPHA_NUMERIC_STRING.length).toInt()
        builder.append(ALPHA_NUMERIC_STRING[character])
    }
    return builder.toString().toLowerCase()
}