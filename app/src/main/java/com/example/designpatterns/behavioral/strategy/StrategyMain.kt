package com.example.designpatterns.behavioral.strategy

import com.example.designpatterns.behavioral.strategy.strategies.SaveStrategy
import com.example.designpatterns.behavioral.strategy.strategies.WorkWithGoogleCloud
import com.example.designpatterns.behavioral.strategy.strategies.WorkWithYandexCloud

/**
 * @author Evdokimov on 05.03.2022.
 *
 * Разбивает похожие алгоритмы по классам, после чего возможно взаимозаменять их в процессе работы.
 */
fun main() {

    val location = "Russia"
    val data = "Какие-то данные"

    val saveStrategy: SaveStrategy =
            if (location == "Russia") WorkWithYandexCloud() else WorkWithGoogleCloud()

    saveStrategy.save(data)
}