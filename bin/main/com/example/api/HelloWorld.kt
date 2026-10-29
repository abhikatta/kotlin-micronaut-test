package com.example.api

import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Produces


@Controller("/hello")
class HelloController {
    @Get
    @Produces(MediaType.TEXT_PLAIN)
    fun hello(): String {
        return "Hello World"
    }

    @Get("/json")
    fun helloJSON(): Map<String, String> {
        return mapOf("message" to "Hello, world!")
    }
}