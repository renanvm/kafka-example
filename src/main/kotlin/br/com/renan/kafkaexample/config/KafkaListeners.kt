package br.com.renan.kafkaexample.config

import org.springframework.kafka.annotation.KafkaListener
import org.springframework.stereotype.Component

@Component
class KafkaListeners {
    @KafkaListener(topics = ["example"], groupId = "groupId")
    fun listener(data: String) {
        println("Listener received: $data")
    }
}