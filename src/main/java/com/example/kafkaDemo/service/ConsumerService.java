package com.example.kafkaDemo.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {

    @KafkaListener(topics = "example_Topic",groupId = "group1")
    public void listenToTopic(String receivedMsg){
        System.out.println("msg received :"+receivedMsg);
    }
}
