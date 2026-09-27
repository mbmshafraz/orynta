package net.shafraz.orynta.core.domain.repository

import net.shafraz.orynta.core.model.DiaryEntry

interface DiaryRepository {
    fun getDiaryEntries(): List<DiaryEntry>
}
