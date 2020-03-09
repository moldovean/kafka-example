package com.comcast.demokafka001.controllers;

import lombok.extern.log4j.Log4j2;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@Log4j2
@RestController
public class KafkaController {

    private final KafkaTemplate<String, String> kafkaTemplate;

    public KafkaController(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @GetMapping("/")
    public String hello() {
        return "hello World";
    }

    @GetMapping("/kafka/{message}")
    public String helloKafka(@PathVariable String message) {
        kafkaTemplate.send("topic1", message);
        log.info("here is it: " + message);
        return "Message Sent";
    }


}
