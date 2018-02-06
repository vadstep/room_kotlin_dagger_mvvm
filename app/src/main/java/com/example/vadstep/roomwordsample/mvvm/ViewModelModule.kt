package com.example.vadstep.roomwordsample.mvvm

import android.app.Application
import com.example.vadstep.roomwordsample.repo.WordRepository
import com.example.vadstep.roomwordsample.mvvm.WordViewModel
import dagger.Module
import dagger.Provides
import javax.inject.Inject
import javax.inject.Singleton


/**
 * Created by User1 on 05/02/2018.
 */
@Module
class ViewModelModule {

    @Singleton
    @Provides
    internal fun providesViewModel(repo: WordRepository, mApplication: Application): WordViewModel {
        return WordViewModel(repo, mApplication)
    }
}