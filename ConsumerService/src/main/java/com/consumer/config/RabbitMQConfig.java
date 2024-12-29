package com.consumer.config;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableRabbit
public class RabbitMQConfig {

	 @Bean
	    public Queue queue() {
	        return new Queue("message-queue", true); // Declare the queue
	    }
}
