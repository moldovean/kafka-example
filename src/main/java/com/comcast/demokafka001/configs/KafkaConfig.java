package com.comcast.demokafka001.configs;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KafkaConfig {

    @Bean
    public NewTopic adviceTopic() {
        return new NewTopic("topic1", 3, (short) 1);
    }
}
