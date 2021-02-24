package com.pixeltrice.springbootWebSocketchatapp.kafka;

import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.logging.Logger;

@Service
public class consumer {

    private final Logger logger = (Logger) LoggerFactory.getLogger(Producer.class);

    @KafkaListener(topics = "name", groupId = "group_id")
    public void consume(String message) throws IOException {
        logger.info(String.format("#### -> Consumed message -> %s", message));
    }
}
