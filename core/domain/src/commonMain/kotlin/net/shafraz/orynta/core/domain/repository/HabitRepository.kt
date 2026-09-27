package net.shafraz.orynta.core.domain.repository

import net.shafraz.orynta.core.model.Habit

interface HabitRepository {
    fun getHabits(): List<Habit>
}
