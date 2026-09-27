package net.shafraz.orynta.core.data.repository

import net.shafraz.orynta.core.domain.repository.DiaryRepository
import net.shafraz.orynta.core.model.DiaryEntry

class DefaultDiaryRepository : DiaryRepository {
    override fun getDiaryEntries(): List<DiaryEntry> = emptyList()
}
