package com.example.testtodoapp

import daysUntilNewYear

class Greeting {
    private val platform: Platform = getPlatform()

    fun greet(): String {
        return "このAndroidのバージョンは？？ ${platform.name}!" + "\nあと年越しまで${daysUntilNewYear()}日！"
    }
}