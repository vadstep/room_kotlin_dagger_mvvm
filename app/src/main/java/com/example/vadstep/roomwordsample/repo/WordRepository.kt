package com.example.vadstep.roomwordsample.repo

import android.arch.lifecycle.LiveData
import com.example.vadstep.roomwordsample.db.WordDao
import com.example.vadstep.roomwordsample.models.Word
import com.example.vadstep.roomwordsample.models.randomAlphaNumeric
import org.jetbrains.anko.doAsync


/**
 * Created by User1 on 04/02/2018.
 */
class WordRepository(var wordDao: WordDao) {


    internal val allWords: LiveData<List<Word>>

    init {
        allWords = wordDao.getAllWords()
    }

    fun insert(word: Word) {
        doAsync {
            wordDao.insert(word)
        }
    }

    fun deleteAll() {
        doAsync {
            wordDao.deleteAll()
        }
    }

    fun populateRandom() {
            doAsync {
                wordDao.insert(Word(randomAlphaNumeric(8)))
            }
    }
    fun deleteOne() {
        doAsync {
           wordDao.deleteOne()
        }
    }
}