package net.hernandomontoya.borutoapp.di

import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import net.hernandomontoya.borutoapp.data.repository.DataStoreOperationsImpl
import net.hernandomontoya.borutoapp.data.repository.Repository
import net.hernandomontoya.borutoapp.domain.repository.DataStoreOperations
import net.hernandomontoya.borutoapp.domain.use_cases.UseCases
import net.hernandomontoya.borutoapp.domain.use_cases.get_all_heroes.GetAllHeroesUseCase
import net.hernandomontoya.borutoapp.domain.use_cases.get_selected_hero.GetSelectedHeroUseCase
import net.hernandomontoya.borutoapp.domain.use_cases.read_onboarding.ReadOnBoardingUseCase
import net.hernandomontoya.borutoapp.domain.use_cases.save_onboarding.SaveOnBoardingUseCase
import net.hernandomontoya.borutoapp.domain.use_cases.search_heroes.SearchHeroesUseCase
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Provides
    @Singleton
    fun provideDataStoreOperations(
        @ApplicationContext context: Context
    ): DataStoreOperations {
        return DataStoreOperationsImpl(context = context)
    }

    @Provides
    @Singleton
    fun provideUseCases(repository: Repository): UseCases {
        return UseCases(
            saveOnBoardingUseCase = SaveOnBoardingUseCase(repository),
            readOnBoardingUseCase = ReadOnBoardingUseCase(repository),
            getAllHeroesUseCase = GetAllHeroesUseCase(repository),
            searchHeroesUseCase = SearchHeroesUseCase(repository),
            getSelectedHeroUseCase = GetSelectedHeroUseCase(repository)
        )
    }
}