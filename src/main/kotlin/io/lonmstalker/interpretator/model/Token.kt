package io.lonmstalker.interpretator.model

import io.lonmstalker.interpretator.enums.TokenType

data class TokenValue(
        val type: TokenType,
        val value: Any
)