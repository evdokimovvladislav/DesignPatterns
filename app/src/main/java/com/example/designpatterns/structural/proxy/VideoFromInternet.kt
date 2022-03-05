package com.example.designpatterns.structural.proxy

/**
 * @author Evdokimov on 05.03.2022.
 */
class VideoFromInternet(private val url: String) : Video {

    init {
        load()
    }

    override fun display() {
        println("Показывается видео")
    }

    private fun load() {
        println("Скачали по $url")
    }
}