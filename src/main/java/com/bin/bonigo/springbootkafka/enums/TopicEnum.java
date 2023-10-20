package com.bin.bonigo.springbootkafka.enums;

public enum TopicEnum {
    KAFKA_TOPIC_STRING_NAME(Constants.KAFKA_STRING_NAME),
    KAFKA_TOPIC_JSON_NAME(Constants.KAFKA_JSON_NAME);

    private final String name;

    TopicEnum(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static class Constants {
        public static final String KAFKA_STRING_NAME = "kafkaTopicStringName";
        public static final String KAFKA_JSON_NAME = "kafkaTopicJsonName";
    }
}
