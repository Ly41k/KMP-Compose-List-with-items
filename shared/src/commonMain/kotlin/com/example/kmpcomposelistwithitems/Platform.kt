package com.example.kmpcomposelistwithitems

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform