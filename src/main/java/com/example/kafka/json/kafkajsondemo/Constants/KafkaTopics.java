package com.example.kafka.json.kafkajsondemo.Constants;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopics {
    @Value("${spring.kafka.topic.name}")
    private String orderKafkatopic;



}
