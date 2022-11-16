package pl.org.akai.polimapa

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform