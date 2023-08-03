package com.example.kafka.json.kafkajsondemo.Consumers;

import com.example.kafka.json.kafkajsondemo.Models.Order;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class JsonConsumers {

    @KafkaListener(topics = "${spring.kafka.topic.name}",groupId = "${spring.kafka.consumer.group-id}")
    public void recivedMessage(Order order){
        System.out.println("Consumer Message Recived Sucessfully"+order.toString());
    }
}
