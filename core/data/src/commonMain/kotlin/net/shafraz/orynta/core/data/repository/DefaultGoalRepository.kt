package net.shafraz.orynta.core.data.repository

import net.shafraz.orynta.core.domain.repository.GoalRepository
import net.shafraz.orynta.core.model.Goal

class DefaultGoalRepository : GoalRepository {
    override fun getGoals(): List<Goal> = emptyList()
}
