package com.example.api

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get


@Controller("/hello")
class HelloController {
    @Get
    fun hi(): Map<String, String> {
        return mapOf("yo" to "Hello, world!")
    }
}