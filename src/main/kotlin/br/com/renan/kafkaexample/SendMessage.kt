package br.com.renan.kafkaexample

import org.springframework.boot.CommandLineRunner
import org.springframework.kafka.core.KafkaTemplate
import org.springframework.stereotype.Component

@Component
class SendMessage(var kafkaTemplate: KafkaTemplate<String, String>) : CommandLineRunner {
    override fun run(vararg args: String?) {
        for (i in 1..10) {
            kafkaTemplate.send("example", "hello kafka $i")
        }
    }

}