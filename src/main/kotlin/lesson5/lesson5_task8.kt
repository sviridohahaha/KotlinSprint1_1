package lesson5

import org.jsoup.Jsoup

const val QUOTES_URL = "https://mybook.ru/author/duglas-adams/avtostopom-po-galaktike-restoran-u-konca-vselennoj/citations/"

fun main() {
    val document = Jsoup.connect(QUOTES_URL).get()

    val quotes = document.select("article")

    if (quotes.isEmpty()) {
        println("No quotes found on the page.")
    } else {
        println("Quotes from 'The Hitchhiker's Guide to the Galaxy':")
        quotes.forEach { println(it.text()) }
    }
}