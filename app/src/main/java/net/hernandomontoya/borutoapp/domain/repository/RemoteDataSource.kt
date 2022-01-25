package net.hernandomontoya.borutoapp.domain.repository

import androidx.paging.PagingData
import kotlinx.coroutines.flow.Flow
import net.hernandomontoya.borutoapp.domain.model.Hero

interface RemoteDataSource {

    fun getAllHeroes(): Flow<PagingData<Hero>>
    fun searchHeroes(query: String): Flow<PagingData<Hero>>
}