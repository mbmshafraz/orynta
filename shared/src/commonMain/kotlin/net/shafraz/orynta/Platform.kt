package net.shafraz.orynta

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform