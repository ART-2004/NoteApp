package com.example.noteapp.domain.model

class Note(
    val id: Int = DEFAULT_ID,
    val title: String? = null,
    val desc: String? = null,
) {
    companion object {
        const val DEFAULT_ID = 0
    }
}