package com.rustam.topicgrid.data

import com.rustam.topicgrid.R
import com.rustam.topicgrid.model.Topic

class Datasource {
    fun loadTopics(): List<Topic> {
        return listOf<Topic>(
            Topic(R.string.topic1, R.drawable.architecture, randomNumber()),
            Topic(R.string.topic1, R.drawable.architecture, randomNumber()),
            Topic(R.string.topic2, R.drawable.business, randomNumber()),
            Topic(R.string.topic2, R.drawable.business, randomNumber()),
            Topic(R.string.topic3, R.drawable.crafts, randomNumber()),
            Topic(R.string.topic3, R.drawable.crafts, randomNumber()),
            Topic(R.string.topic4, R.drawable.culinary, randomNumber()),
            Topic(R.string.topic4, R.drawable.culinary, randomNumber()),
            Topic(R.string.topic5, R.drawable.design, randomNumber()),
            Topic(R.string.topic5, R.drawable.design, randomNumber()),
            Topic(R.string.topic6, R.drawable.drawing, randomNumber()),
            Topic(R.string.topic6, R.drawable.drawing, randomNumber()),
            Topic(R.string.topic7, R.drawable.fashion, randomNumber()),
            Topic(R.string.topic7, R.drawable.fashion, randomNumber()),
            Topic(R.string.topic8, R.drawable.film, randomNumber()),
            Topic(R.string.topic9, R.drawable.gaming, randomNumber()),
            Topic(R.string.topic9, R.drawable.gaming, randomNumber()),
            Topic(R.string.topic10, R.drawable.lifestyle, randomNumber()),
            Topic(R.string.topic10, R.drawable.lifestyle, randomNumber()),
            Topic(R.string.topic11, R.drawable.music, randomNumber()),
            Topic(R.string.topic11, R.drawable.music, randomNumber()),
            Topic(R.string.topic12, R.drawable.painting, randomNumber()),
            Topic(R.string.topic13, R.drawable.photography, randomNumber()),
            Topic(R.string.topic13, R.drawable.photography, randomNumber()),
            Topic(R.string.topic14, R.drawable.tech, randomNumber())
            )
    }
}

fun randomNumber(): Int = (0..500).random()