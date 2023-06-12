package com.example.noteapp.di

import android.content.Context
import androidx.room.Room
import com.example.noteapp.data.local.NoteDao
import com.example.noteapp.data.local.NoteDatabase
import com.example.noteapp.data.repositories.NoteRepositoryImpl
import com.example.noteapp.domain.repositories.NoteRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NoteModule {

    @Singleton
    @Provides
    fun provideNoteDatabase(
        @ApplicationContext context: Context
    ) = Room.databaseBuilder(
        context, NoteDatabase::class.java,
        "note-db"
    )

    @Provides
    fun provideNoteDao(noteDatabase: NoteDatabase) = noteDatabase.noteDao()


    @Provides
    fun provideNoteRepository(noteDao: NoteDao): NoteRepository {
        return NoteRepositoryImpl(noteDao)
    }
}