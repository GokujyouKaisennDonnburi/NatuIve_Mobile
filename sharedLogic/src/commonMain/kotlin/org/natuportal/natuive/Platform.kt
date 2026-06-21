package org.natuportal.natuive

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform