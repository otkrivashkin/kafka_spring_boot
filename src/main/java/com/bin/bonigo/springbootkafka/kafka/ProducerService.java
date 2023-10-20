package com.bin.bonigo.springbootkafka.kafka;

import com.bin.bonigo.springbootkafka.enums.TopicName;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ProducerService {

    private static final Logger LOGGER = LoggerFactory.getLogger(ProducerService.class);

    @Autowired
    private KafkaTemplate<String, String> template;

    public void sendMessage(String message) {
        LOGGER.info(String.format("Sent message %s", message));
        template.send(TopicName.KAFKA_TOPIC_NAME.getName(), message);
    }
}
