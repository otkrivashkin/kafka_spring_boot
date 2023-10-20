package com.bin.bonigo.springbootkafka.kafka;

import com.bin.bonigo.springbootkafka.enums.TopicEnum;
import com.bin.bonigo.springbootkafka.payload.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
public class JsonProducerService {

    private static final Logger LOGGER = LoggerFactory.getLogger(JsonProducerService.class);

    @Autowired
    private KafkaTemplate<String, String> template;

    public void sendMessage(User user) {

        LOGGER.info(String.format("Message sent -> %s", user.toString()));

        Message<User> message = MessageBuilder
                .withPayload(user)
                .setHeader(KafkaHeaders.TOPIC, TopicEnum.KAFKA_TOPIC_JSON_NAME.getName())
                .build();
        template.send(message);
    }

}
