package org.springboot.kafka.component;

import org.springboot.kafka.response.RapidoDriver;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumerComponent 
{
	
	@KafkaListener(topics = "my-topic", groupId = "my-topic-group")
	public void listenMessage(RapidoDriver driverLocation)
	{
		System.out.println("Driver id " + driverLocation.getDriver_id() + " reached at " + 
				driverLocation.getLatitude() + " and " + driverLocation.getLongitude());
	}
	
	/*
	 * We can also create kafka topics from KafkaListener(topics = "give new topics")
	 * Only requirement is to enable topics creation from spring into kafka.
	 * Commands: {spring.kafka.admin.auto-create=true}.
	 */

}
