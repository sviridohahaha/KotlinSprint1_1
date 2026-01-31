package lesson_22

import java.time.LocalDateTime

data class GalacticGuide(
    val title: String,
    val description: String,
    val eventDate: LocalDateTime,
    val distanceFromEarth: Double,
)

fun main() {
    val alphaCentauri = GalacticGuide(
        "Alpha Centauri",
        "Alpha Centauri is the closest star system to Earth, consisting of three stars",
        LocalDateTime.now(),
        4.367
    )

    println("Title: ${alphaCentauri.title}")
    println("Description: ${alphaCentauri.description}")
    println("Event date: ${alphaCentauri.eventDate}")
    println("Distance from Earth: ${alphaCentauri.distanceFromEarth}")
}
