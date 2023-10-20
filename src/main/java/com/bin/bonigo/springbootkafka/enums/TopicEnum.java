package com.bin.bonigo.springbootkafka.enums;

public enum TopicEnum {
    KAFKA_TOPIC_NAME(Constants.NAME);

    private final String name;

    TopicEnum(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static class Constants {
        public static final String NAME = "kafkaTopicName";
    }
}
