package com.demo.log4j2.demo.log4j2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@Configuration
@EnableScheduling
public class App 
{
	private static final Logger logger = LogManager.getLogger(App.class);
	
	public static void main(String[] args) {
		logger.error("Password from Log4j 2", "prueba");
		//api
		System.out.println(org.apache.logging.log4j.Logger.class.getResource("/org/ap‌​ache/logging/log4j/Logger.class"));
		//core
		System.out.println(org.apache.logging.log4j.Logger.class.getResource("/org/ap‌​ache/logging/log4j/core/Appender.class"));
		//config
		System.out.println(org.apache.logging.log4j.Logger.class.getResource("/log4j2.xml"));
		SpringApplication.run(App.class, args);
	}
}
