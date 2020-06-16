package com.spring.scheduler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.TaskScheduler;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.concurrent.ConcurrentTaskScheduler;

@SpringBootApplication
@ComponentScan({ "com.scheduler", "com.config.hazelcast" })
@Configuration
@EnableScheduling
public class ShedulerDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShedulerDemoApplication.class, args);
	}
	
}
