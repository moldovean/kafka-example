package com.comcast.demokafka001.consumers;

import lombok.extern.log4j.Log4j2;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Log4j2
@Service
public class KafkaTopic1Listener {

    @KafkaListener(topics = "topic1", id = "simple-consumer")
    public void topic1Consumer(String message) {
        System.out.println("We received: "+ message);
        log.info("Received a message: <--- " + message);

    }
}
