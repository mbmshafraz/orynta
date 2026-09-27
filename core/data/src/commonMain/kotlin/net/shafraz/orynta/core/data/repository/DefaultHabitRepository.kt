package net.shafraz.orynta.core.data.repository

import net.shafraz.orynta.core.domain.repository.HabitRepository
import net.shafraz.orynta.core.model.Habit

class DefaultHabitRepository : HabitRepository {
    override fun getHabits(): List<Habit> = emptyList()
}
