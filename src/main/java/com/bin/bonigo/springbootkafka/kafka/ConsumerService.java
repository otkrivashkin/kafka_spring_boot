package com.bin.bonigo.springbootkafka.kafka;

import com.bin.bonigo.springbootkafka.enums.TopicEnum;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {

    private static final Logger LOGGER = LoggerFactory.getLogger(ConsumerService.class);

    @KafkaListener(topics = TopicEnum.Constants.NAME, groupId = "myGroup")
    public void consume(String message) {
        LOGGER.info(String.format("Message received -> %s", message));
    }

}
