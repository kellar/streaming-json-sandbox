package com.blakekellar.streamingjson.sandbox.handler

import org.springframework.web.reactive.function.server.ServerRequest
import org.springframework.web.reactive.function.server.ServerResponse
import reactor.core.publisher.Mono

interface ThingHandler {
    fun get(request: ServerRequest): Mono<ServerResponse>
}