package com.example.kafka.json.kafkajsondemo.Controllers;

import com.example.kafka.json.kafkajsondemo.Models.Order;
import com.example.kafka.json.kafkajsondemo.Producers.JsonProducers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/publish/order")
public class OrderController {

    @Autowired
    JsonProducers jsonProducers;

    @PostMapping
    public String sendOrder(@RequestBody Order order){
        jsonProducers.sendOrderDetails(order);
        return String.valueOf(ResponseEntity.ok());
    }

}
