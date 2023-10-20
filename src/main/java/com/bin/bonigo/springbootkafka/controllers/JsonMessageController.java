package com.bin.bonigo.springbootkafka.controllers;

import com.bin.bonigo.springbootkafka.kafka.JsonProducerService;
import com.bin.bonigo.springbootkafka.payload.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/kafka/json")
public class JsonMessageController {

    @Autowired
    private JsonProducerService producer;

    @PostMapping("/publish")
    public ResponseEntity<String> publishMessage(@RequestBody User user) {
        producer.sendMessage(user);
        return ResponseEntity.ok("Json message sent to the kafka topic");
    }

}
