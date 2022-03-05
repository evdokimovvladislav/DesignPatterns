package com.example.designpatterns.structural.proxy

/**
 * @author Evdokimov on 05.03.2022.
 *
 * Замещает объект его объектом-заместителем, который позволяет выполнять какие-то действия до
 * и после работы с оригиналом
 */
fun main() {

    val url = "https://www.youtube.com/some_video"

    var video: Video = VideoFromInternet(url)
    println("Видео скачалось до воспроизведения")
    video.display()
    println()

    video = ProxyVideo(url)
    println("Видео скачалось во время воспроизведения")
    video.display()
}