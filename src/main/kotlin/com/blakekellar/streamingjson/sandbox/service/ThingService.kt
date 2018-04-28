package com.blakekellar.streamingjson.sandbox.service

import com.blakekellar.streamingjson.sandbox.model.Thing
import reactor.core.publisher.Flux

interface ThingService {
    fun get(): Flux<Thing>
}