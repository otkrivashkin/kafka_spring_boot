package com.bin.bonigo.springbootkafka.config;

import com.bin.bonigo.springbootkafka.enums.TopicName;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    @Bean
    public NewTopic newTopic() {
        return TopicBuilder.name(TopicName.KAFKA_TOPIC_NAME.getName())
                .build();
    }

}