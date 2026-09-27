package net.shafraz.orynta.core.domain.repository

import net.shafraz.orynta.core.model.Goal

interface GoalRepository {
    fun getGoals(): List<Goal>
}
