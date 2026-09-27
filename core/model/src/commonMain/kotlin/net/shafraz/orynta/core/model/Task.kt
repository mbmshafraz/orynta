package net.shafraz.orynta.core.model

data class Task(
    val id: String,
    val title: String,
    val isCompleted: Boolean = false,
)
