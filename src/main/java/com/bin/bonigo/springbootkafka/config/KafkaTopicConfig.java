package com.bin.bonigo.springbootkafka.config;

import com.bin.bonigo.springbootkafka.enums.TopicEnum;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    @Bean
    public NewTopic newStringTopic() {
        return TopicBuilder.name(TopicEnum.KAFKA_TOPIC_STRING_NAME.getName())
                .build();
    }

    @Bean
    public NewTopic newJsonTopic() {
        return TopicBuilder.name(TopicEnum.KAFKA_TOPIC_JSON_NAME.getName())
                .build();
    }
}
