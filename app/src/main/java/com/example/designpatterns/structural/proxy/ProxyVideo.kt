package com.example.designpatterns.structural.proxy

/**
 * @author Evdokimov on 05.03.2022.
 */
class ProxyVideo(private val url: String) : Video {

    private var video: VideoFromInternet? = null

    override fun display() {
        if (video == null) video = VideoFromInternet(url)
        video?.display()
    }
}