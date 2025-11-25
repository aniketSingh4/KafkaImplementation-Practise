package org.springboot.kafka.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.apache.kafka.clients.admin.NewTopic;

@Configuration
public class KafkaTopicsConf 
{
	@Bean
	public NewTopic createMyTopic()
	{
		return new NewTopic("my-new-topic",3,(short)2);
		//NewTopic(String topicName, int partition, short replicationFactor)
	}

}
