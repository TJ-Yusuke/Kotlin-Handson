package com.example.testtodoapp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform