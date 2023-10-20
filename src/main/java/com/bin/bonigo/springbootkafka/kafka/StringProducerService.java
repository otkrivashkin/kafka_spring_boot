package com.bin.bonigo.springbootkafka.kafka;

import com.bin.bonigo.springbootkafka.enums.TopicEnum;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class StringProducerService {

    private static final Logger LOGGER = LoggerFactory.getLogger(StringProducerService.class);

    @Autowired
    private KafkaTemplate<String, String> template;

    public void sendMessage(String message) {
        LOGGER.info(String.format("Sent message %s", message));
        template.send(TopicEnum.KAFKA_TOPIC_STRING_NAME.getName(), message);
    }
}
