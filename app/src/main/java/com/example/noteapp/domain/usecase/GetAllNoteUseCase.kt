package com.example.noteapp.domain.usecase

import com.example.noteapp.domain.repositories.NoteRepository

class GetAllNotesUseCase (
    private val noteRepository: NoteRepository
){
    fun getAllNotes()= noteRepository.getAllNotes()
}