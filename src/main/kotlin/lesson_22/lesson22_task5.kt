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

    val (title, description, eventDate, distanceFromEarth) = alphaCentauri
    println("Title: $title")
    println("Description: $description")
    println("Event date: $eventDate")
    println("Distance from Earth: $distanceFromEarth")
}
