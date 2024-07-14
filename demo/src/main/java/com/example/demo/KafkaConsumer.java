package com.example.demo;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {
    @KafkaListener(id = "group_test1", topics = "mytopic")
    public void consumeMessage(String message) {
        System.out.println("Consumed message: " + message);
    }
}
