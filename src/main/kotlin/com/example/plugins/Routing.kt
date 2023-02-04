package com.example.plugins

import com.example.routes.characters
import com.example.routes.root
import com.example.routes.searchCharacters
import io.ktor.server.routing.*
import io.ktor.server.response.*
import io.ktor.server.resources.*
import io.ktor.resources.*
import io.ktor.server.resources.Resources
import kotlinx.serialization.Serializable
import io.ktor.server.application.*
import io.ktor.server.http.content.*

fun Application.configureRouting() {
    routing {
        root()
        characters()
        searchCharacters()
        static("/images") {
            resources("/images")
        }
    }
}
