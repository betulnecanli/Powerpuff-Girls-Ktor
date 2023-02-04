package com.example.plugins

import com.example.routes.characters
import com.example.routes.root
import io.ktor.server.routing.*
import io.ktor.server.response.*
import io.ktor.server.resources.*
import io.ktor.resources.*
import io.ktor.server.resources.Resources
import kotlinx.serialization.Serializable
import io.ktor.server.application.*

fun Application.configureRouting() {
    routing {
        root()
        characters()
    }
}
