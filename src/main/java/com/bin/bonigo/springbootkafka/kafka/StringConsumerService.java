package com.bin.bonigo.springbootkafka.kafka;

import com.bin.bonigo.springbootkafka.enums.TopicEnum;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class StringConsumerService {

    private static final Logger LOGGER = LoggerFactory.getLogger(StringConsumerService.class);

    @KafkaListener(topics = TopicEnum.Constants.KAFKA_STRING_NAME, groupId = "myGroup")
    public void stringConsume(String message) {
        LOGGER.info(String.format("Message received -> %s", message));
    }
}
