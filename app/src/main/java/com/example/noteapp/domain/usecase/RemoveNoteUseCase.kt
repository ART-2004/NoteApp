package com.example.noteapp.domain.usecase

import com.example.noteapp.domain.repositories.NoteRepository

class RemoveNoteUseCase (
    private val noteRepository: NoteRepository
) {
    fun removeNote() = noteRepository.removeNote()
}