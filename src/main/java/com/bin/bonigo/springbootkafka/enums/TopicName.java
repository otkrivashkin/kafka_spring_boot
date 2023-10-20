package com.bin.bonigo.springbootkafka.enums;

public enum TopicName {
    KAFKA_TOPIC_NAME("kafkaTopicName");

    private final String name;

    TopicName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
