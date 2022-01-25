package net.hernandomontoya.borutoapp.data.repository

import net.hernandomontoya.borutoapp.data.local.BorutoDatabase
import net.hernandomontoya.borutoapp.domain.model.Hero
import net.hernandomontoya.borutoapp.domain.repository.LocalDataSource

class LocalDataSourceImpl(
    borutoDatabase: BorutoDatabase
) : LocalDataSource {

    private val heroDao = borutoDatabase.heroDao()

    override suspend fun getSelectedHero(heroId: Int): Hero {
        return heroDao.getSelectedHero(heroId = heroId)
    }
}