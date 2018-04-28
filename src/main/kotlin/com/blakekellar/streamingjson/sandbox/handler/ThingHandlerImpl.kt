package com.blakekellar.streamingjson.sandbox.handler

import com.blakekellar.streamingjson.sandbox.model.Thing
import com.blakekellar.streamingjson.sandbox.service.ThingService
import org.springframework.http.MediaType
import org.springframework.stereotype.Service
import org.springframework.web.reactive.function.server.ServerRequest
import org.springframework.web.reactive.function.server.ServerResponse
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@Service
class ThingHandlerImpl(private val thingService: ThingService) : ThingHandler {
    override fun get(request: ServerRequest): Mono<ServerResponse> {
        val things: Flux<Thing> = thingService.get()
        return ServerResponse.ok().contentType(MediaType.APPLICATION_STREAM_JSON).body(things, Thing::class.java)
    }
}