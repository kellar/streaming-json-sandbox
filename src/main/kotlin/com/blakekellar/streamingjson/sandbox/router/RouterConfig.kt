package com.blakekellar.streamingjson.sandbox.router

import com.blakekellar.streamingjson.sandbox.handler.ThingHandler
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.reactive.function.server.HandlerFunction
import org.springframework.web.reactive.function.server.RequestPredicates
import org.springframework.web.reactive.function.server.RouterFunction
import org.springframework.web.reactive.function.server.RouterFunctions

@Configuration
class RouterConfig {

    @Autowired
    lateinit var thingHandler: ThingHandler

    @Bean
    fun routerFunction(): RouterFunction<*> {
        return RouterFunctions.route(
                RequestPredicates.GET("/things"),
                HandlerFunction { request ->
                    thingHandler.get(request)
                })
    }
}