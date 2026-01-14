package lesson5

import org.jsoup.Jsoup
import org.jsoup.nodes.Document

fun main() {
    val url = "https://mybook.ru/author/duglas-adams/avtostopom-po-galaktike-restoran-u-konca-vselennoj/citations/"

    val document: Document = Jsoup.connect(url).get()

    val quotes = document.select("div.sc-2aegk7-2.bzpNIu")

    if (quotes.isEmpty()) {
        println("No quotes found on the page.")
    } else {
        println("Quotes from 'The Hitchhiker's Guide to the Galaxy':")
        quotes.forEach { println(it.text()) }
    }
}