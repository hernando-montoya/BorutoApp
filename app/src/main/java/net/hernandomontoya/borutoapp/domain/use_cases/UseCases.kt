package net.hernandomontoya.borutoapp.domain.use_cases

import net.hernandomontoya.borutoapp.domain.use_cases.get_all_heroes.GetAllHeroesUseCase
import net.hernandomontoya.borutoapp.domain.use_cases.get_selected_hero.GetSelectedHeroUseCase
import net.hernandomontoya.borutoapp.domain.use_cases.read_onboarding.ReadOnBoardingUseCase
import net.hernandomontoya.borutoapp.domain.use_cases.save_onboarding.SaveOnBoardingUseCase
import net.hernandomontoya.borutoapp.domain.use_cases.search_heroes.SearchHeroesUseCase

data class UseCases(
    val saveOnBoardingUseCase: SaveOnBoardingUseCase,
    val readOnBoardingUseCase: ReadOnBoardingUseCase,
    val getAllHeroesUseCase: GetAllHeroesUseCase,
    val searchHeroesUseCase: SearchHeroesUseCase,
    val getSelectedHeroUseCase: GetSelectedHeroUseCase
)
