package com.example.noteapp.domain.repositories

import com.example.noteapp.domain.model.Note
import com.example.noteapp.domain.utils.Resource
import kotlinx.coroutines.flow.Flow

interface NoteRepository {

    fun createNote(noteEntity: Note): Flow<Resource<Unit>>

    fun getAllNotes(): Flow<Resource<List<Note>>>

    fun editNote(noteEntity: Note): Flow<Resource<Unit>>

    fun removeNote(noteEntity: Note): Flow<Resource<Unit>>

}