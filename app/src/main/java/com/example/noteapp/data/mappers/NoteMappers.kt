package com.example.noteapp.data.mappers

import com.example.noteapp.data.model.NoteEntity
import com.example.noteapp.domain.model.Note

fun Note.toEntity() = NoteEntity(id, title, desc)

fun NoteEntity.toNote() = Note(id, title, desc)