package net.hernandomontoya.borutoapp.domain.use_cases.search_heroes

import androidx.paging.PagingData
import kotlinx.coroutines.flow.Flow
import net.hernandomontoya.borutoapp.data.repository.Repository
import net.hernandomontoya.borutoapp.domain.model.Hero

class SearchHeroesUseCase(
    private val repository: Repository
) {

    operator fun invoke(query: String): Flow<PagingData<Hero>> {
        return repository.searchHeroes(query)
    }
}