package com.example.routes

import com.example.repository.PPGRepository
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import org.koin.ktor.ext.inject

fun Route.searchCharacters(){

    val ppgirlsRepository : PPGRepository by inject()

    get("/powerpuffgirls/characters/search"){
        val name = call.request.queryParameters["name"]

        val apiResponse  = ppgirlsRepository.searchCharacters(name)

        call.respond(message = apiResponse, status = HttpStatusCode.OK)
    }
}