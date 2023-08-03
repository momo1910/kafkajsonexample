package com.example.kafka.json.kafkajsondemo.Producers;
import com.example.kafka.json.kafkajsondemo.Models.Order;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class JsonProducers {


    @Value("${spring.kafka.topic.name}")
    private String orderKafkatopic;

    KafkaTemplate<String, Order> kafkaTemplate;

    public JsonProducers(KafkaTemplate<String, Order> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }
    public void sendOrderDetails(Order order){
        System.out.println("Message to be sent is"+order.toString());
        kafkaTemplate.send(orderKafkatopic,order);

        System.out.println("Message sent successfully"+order.toString());
    }
}
