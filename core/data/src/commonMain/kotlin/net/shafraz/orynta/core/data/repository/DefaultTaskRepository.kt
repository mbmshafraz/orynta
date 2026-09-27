package net.shafraz.orynta.core.data.repository

import net.shafraz.orynta.core.domain.repository.TaskRepository
import net.shafraz.orynta.core.model.Task

class DefaultTaskRepository : TaskRepository {
    override fun getTasks(): List<Task> = emptyList()
}
