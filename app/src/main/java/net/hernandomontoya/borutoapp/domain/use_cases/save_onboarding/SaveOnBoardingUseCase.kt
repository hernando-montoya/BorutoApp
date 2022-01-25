package net.hernandomontoya.borutoapp.domain.use_cases.save_onboarding

import net.hernandomontoya.borutoapp.data.repository.Repository

class SaveOnBoardingUseCase(
    private val repository: Repository
) {
    suspend operator fun invoke(completed: Boolean) {
        repository.saveOnBoardingState(completed)
    }
}