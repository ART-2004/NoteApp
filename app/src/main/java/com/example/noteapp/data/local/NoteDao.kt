package com.example.noteapp.data.local

import androidx.room.*
import com.example.noteapp.data.model.NoteEntity

@Dao
interface NoteDao {

//    CRUD

    fun createNote(noteEntity: NoteEntity)

    fun getAllNotes(): List<NoteEntity>

    fun editNote(noteEntity: NoteEntity)

    fun removeNote(noteEntity: NoteEntity)

}