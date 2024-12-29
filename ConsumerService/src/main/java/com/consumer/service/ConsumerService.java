package com.consumer.service;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {
	  @RabbitListener(queues = "message-queue")
	    public void consumeMessage(String message) {
	        System.out.println("Received message: " + message);
	        System.out.println("hellow");
	   }
}
