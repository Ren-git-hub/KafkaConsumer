package com.renish.kafkaconsumer.service;

import com.renish.kafkaconsumer.model.Customers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {

    Logger log = LoggerFactory.getLogger(ConsumerService.class);

    @KafkaListener(topics = "topic02" , groupId = "Group03")
    public void consumeMessage(Customers customers) {
        log.info(customers.toString());
        System.out.println(customers.toString());

    }

//    @KafkaListener(topics = "topic02" , groupId = "Group02")
//    public void consumeObj(Customers customers) {
//       try {
//           System.out.println(customers.toString());
//
//       } catch (Exception e) {
//           System.out.println(e.getMessage());;
//       }
//
//    }
}
