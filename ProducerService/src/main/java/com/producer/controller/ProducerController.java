package com.producer.controller;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/produce")
public class ProducerController {
	

	private RabbitTemplate rabbitTemplate;
	
	@Value("${producer.queue.name}")
	private String queueName;
	
	
	public ProducerController(RabbitTemplate rabbitTemplate) {
		 this.rabbitTemplate = rabbitTemplate;
	}
	
	 @PostMapping("/{message}")
	    public String produceMessage(@PathVariable String message) {
		 System.out.println(message);
	        rabbitTemplate.convertAndSend(queueName, message);
	        
	        return "Message sent: " + message;
	    }
	

}
