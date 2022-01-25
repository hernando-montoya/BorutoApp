package net.hernandomontoya.borutoapp.domain.use_cases.get_all_heroes

import androidx.paging.PagingData
import kotlinx.coroutines.flow.Flow
import net.hernandomontoya.borutoapp.data.repository.Repository
import net.hernandomontoya.borutoapp.domain.model.Hero

class GetAllHeroesUseCase(
    private val repository: Repository
) {
    operator fun invoke(): Flow<PagingData<Hero>> {
        return repository.getAllHeroes()
    }
}