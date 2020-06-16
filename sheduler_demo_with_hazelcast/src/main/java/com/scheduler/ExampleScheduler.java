package com.scheduler;

import java.io.Serializable;

import org.springframework.stereotype.Component;

@Component
public class ExampleScheduler implements Runnable, Serializable{
	
	
/**
	 * 
	 */
	private static final long serialVersionUID = 8256784301535958570L;

//	@Scheduled(cron = "0 0/1 * 1/1 * *")
//	@Scheduled(fixedDelay = 10000)
    public void run() {
        System.out.println("Task executed");
    }
}
