package com.producer.config;

import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfig {
	
	@Value("${producer.queue.name}")
	private String queueName;
	
	@Bean
	public Queue queue() {
		System.out.println(queueName);
		return new Queue(queueName,true);
	}

}
