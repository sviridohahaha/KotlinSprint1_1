package lesson_22

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

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

    val formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")

    println("Title: ${alphaCentauri.title}")
    println("Description: ${alphaCentauri.description}")
    println("Event date: ${alphaCentauri.eventDate.format(formatter)}")
    println("Distance from Earth: ${alphaCentauri.distanceFromEarth}")
}
