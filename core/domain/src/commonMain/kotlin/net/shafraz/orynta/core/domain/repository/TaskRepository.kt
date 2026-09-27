package net.shafraz.orynta.core.domain.repository

import net.shafraz.orynta.core.model.Task

interface TaskRepository {
    fun getTasks(): List<Task>
}
