package com.example.noteapp.data.repositories

import com.example.noteapp.data.local.NoteDao

class NoteRepositoryImpl(
    private val noteDao: NoteDao
): NoteRepository{
    override fun createNote(note: Note){
       return noteDao.getAllNotes()
    }

    override fun getAllNotes() {
       noteDao.createNote(note.toEntity())
    }

    override fun editNote(note: Note) {
        noteDao.updateNote(note.toEntity())
    }

    override fun removeNote(note: Note){
        noteDao.removeNote(note.toEntity())
    }


}