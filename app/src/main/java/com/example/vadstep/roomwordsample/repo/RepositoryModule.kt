package com.example.vadstep.roomwordsample.repo

import com.example.vadstep.roomwordsample.db.WordDao
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by vadym on 2/6/18.
 */
@Module
class RepositoryModule {
    @Singleton
    @Provides
    internal fun productRepository(wordDao: WordDao): WordRepository {
        return WordRepository(wordDao)
    }
}