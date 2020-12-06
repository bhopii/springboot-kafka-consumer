package com.abhi.kafka.consumer.config.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.abhi.kafka.consumer.models.User;

@Service
public class KafkaConsumer {
	
	@KafkaListener(topics = "Kafka_Example_Text", groupId = "group_text")
	public void consume(String message) {
		System.out.println("Consumed Text Message " + message);
	}
	
	
	@KafkaListener(topics = "Kafka_Example", groupId = "group_json", containerFactory = "userKafkaListenerContainerFactory")
	public void consumeJson(User user) {
		System.out.println("Consumed Json " + user);
	}

}
