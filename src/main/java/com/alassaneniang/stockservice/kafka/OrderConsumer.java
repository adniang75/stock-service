package com.alassaneniang.stockservice.kafka;

import com.alassaneniang.basedomains.dto.OrderEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class OrderConsumer {

    @KafkaListener(topics = "${spring.kafka.topic.name}", groupId = "${spring.kafka.consumer.group-id}")
    public void consume(OrderEvent event) {
        log.info("Order event received in stock service -> {}", event);
        // save the order event into a database
    }

}
