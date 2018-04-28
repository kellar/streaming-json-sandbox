package com.blakekellar.streamingjson.sandbox.service

import com.blakekellar.streamingjson.sandbox.model.Thing
import org.springframework.stereotype.Service
import reactor.core.publisher.Flux
import java.time.Duration

@Service
class ThingServiceImpl : ThingService {
    override fun get(): Flux<Thing> {
        return Flux.just(Thing("foo"), Thing("bar"), Thing("baz"))
                .delayElements(Duration.ofSeconds(1))
                .map { thing -> thing.copy(thing.state.reversed()) }
    }
}