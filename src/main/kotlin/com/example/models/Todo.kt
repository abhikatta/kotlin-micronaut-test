package com.example.models

import io.micronaut.serde.annotation.Serdeable
import java.sql.Timestamp


@Serdeable
data class TodoData(
    val title: String,
    val completed: Boolean = false,
)

@Serdeable
data class Todo(
    val id: Long,
    val title: String,
    val completed: Boolean,
    val createdAt: Timestamp
)

@Serdeable
data class TodosResponse(
    val totalTodos: Int,
    val todos: List<Todo>
)