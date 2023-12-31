package com.bin.bonigo.springbootkafka.kafka;

import com.bin.bonigo.springbootkafka.enums.TopicEnum;
import com.bin.bonigo.springbootkafka.payload.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class JsonConsumerService {

    private static final Logger LOGGER = LoggerFactory.getLogger(JsonConsumerService.class);

    @KafkaListener(topics = TopicEnum.Constants.KAFKA_JSON_NAME, groupId = "myGroup")
    public void jsonConsume(User user) {
        LOGGER.info(String.format("Message received -> %s", user.toString()));
    }
}
