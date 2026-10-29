package com.example.service

import com.example.models.Todo
import jakarta.inject.Singleton
import java.sql.Timestamp

@Singleton
class TodoService(private val todoRepository: TodoRepository) {
    fun createTodo(title: String, completed: Boolean): Long {
        val id = todoRepository.create(
            id = 2324234,
            title = title,
            completed = completed,
            createdAt = Timestamp(System.currentTimeMillis())
        )
        return id
    }

    fun readTodos(): List<Todo> {
        return todoRepository.readAll()
    }
}