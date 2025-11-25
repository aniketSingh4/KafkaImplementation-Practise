package org.springboot.kafka.controller;

import org.springboot.kafka.dto.RapidoDriver;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class KafkaProducerController 
{
	private final KafkaTemplate<String, RapidoDriver> kafkaTemplate;

	public KafkaProducerController(KafkaTemplate<String, RapidoDriver> kafkaTemplate) 
	{
		super();
		this.kafkaTemplate = kafkaTemplate;
	}
	
	@PostMapping("/send")
	public String sendMessage(@RequestParam String message)
	{
		RapidoDriver driverLocation = new RapidoDriver(123, "78.99", "76.78");
		kafkaTemplate.send("my-topic",driverLocation);
		
		return "Message Send: " + message;
	}
	

}
