package com.blakekellar.streamingjson.sandbox.model

import java.time.Instant

data class Thing(
        val state: String,
        val createdAt: Instant = Instant.now(),
        val modifiedAt: Instant = Instant.MIN) {

    // prevent modification of createdAt, force modification of modifiedAt
    fun copy(state: String): Thing {
        return Thing(state, this.createdAt, modifiedAt = Instant.now())
    }
}