package edu.learning.myprofileapp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform