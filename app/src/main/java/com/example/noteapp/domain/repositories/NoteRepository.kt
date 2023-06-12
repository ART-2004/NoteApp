package com.example.noteapp.domain.repositories

import com.example.noteapp.domain.model.Note
import kotlinx.coroutines.flow.Flow

interface NoteRepository {

    fun createNote(noteEntity: Note)

    fun getAllNotes():<List<Note>>

    fun editNote(noteEntity: Note)

    fun removeNote(noteEntity: Note)

}