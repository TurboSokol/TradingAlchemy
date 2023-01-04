package com.turbosokol.tradingalchemy

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform