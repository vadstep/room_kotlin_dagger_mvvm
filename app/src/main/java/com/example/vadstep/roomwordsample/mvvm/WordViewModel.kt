package com.example.vadstep.roomwordsample.mvvm

import android.app.Application
import android.arch.lifecycle.AndroidViewModel
import android.arch.lifecycle.LiveData
import com.example.vadstep.roomwordsample.models.Word
import com.example.vadstep.roomwordsample.repo.WordRepository


/**
 * Created by User1 on 05/02/2018.
 */
class WordViewModel(var mRepository: WordRepository, application :Application) : AndroidViewModel(application) {


    internal val allWords: LiveData<List<Word>>

    init {
        allWords = mRepository.allWords
    }

    fun insert(word: Word) {
        mRepository.insert(word)
    }
    fun deleteAll() {
        mRepository.deleteAll()
    }
    fun populateRandom() {
        mRepository.populateRandom()
    }
    fun deleteOne() {
        mRepository.deleteOne()
    }
}