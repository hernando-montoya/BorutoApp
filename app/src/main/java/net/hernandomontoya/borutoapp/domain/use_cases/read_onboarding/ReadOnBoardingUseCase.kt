package net.hernandomontoya.borutoapp.domain.use_cases.read_onboarding

import kotlinx.coroutines.flow.Flow
import net.hernandomontoya.borutoapp.data.repository.Repository

class ReadOnBoardingUseCase(
    private val repository: Repository
) {
    operator fun invoke(): Flow<Boolean> {
        return repository.readOnBoardingState()
    }
}