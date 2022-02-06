package br.com.renan.kafkaexample

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KafkaApplication

fun main(args: Array<String>) {
    runApplication<KafkaApplication>(*args)
}