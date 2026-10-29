package com.example.service

import com.example.models.Todo
import java.sql.Timestamp

interface TodoRepository {
    fun create(
        id: Long,
        title: String,
        completed: Boolean,
        createdAt: Timestamp
    ): Long

    fun readAll(): List<Todo>

    fun read(): Todo

    fun update(
        id: Long,
        title: String,
        completed: Boolean,
        createdAt: Timestamp
    ): Long

    fun delete(id: Long): Long
}