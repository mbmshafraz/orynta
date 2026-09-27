package net.shafraz.orynta.core.model

data class Habit(
    val id: String,
    val title: String,
    val streakCount: Int = 0,
)
