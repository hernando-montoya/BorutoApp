package net.hernandomontoya.borutoapp.domain.repository

import net.hernandomontoya.borutoapp.domain.model.Hero

interface LocalDataSource {
    suspend fun getSelectedHero(heroId: Int): Hero
}