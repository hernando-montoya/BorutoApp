package net.hernandomontoya.borutoapp.domain.use_cases.get_selected_hero

import net.hernandomontoya.borutoapp.data.repository.Repository
import net.hernandomontoya.borutoapp.domain.model.Hero

class GetSelectedHeroUseCase(
    private val repository: Repository
) {
    suspend operator fun invoke(heroId: Int): Hero {
        return repository.getSelectedHero(heroId = heroId)
    }
}