package org.springboot.kafka.cloudFunction;

import java.util.function.Function;

import org.springframework.context.annotation.Bean;

public class ProducersMessage 
{
	@Bean
	public Function<String, String> uppercase()
	{
		return String::toUpperCase; //Method References
		//return value -> value.toUpperCase();
	}

}
