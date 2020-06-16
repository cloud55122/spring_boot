package com.scheduler;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;
import org.springframework.scheduling.support.CronTrigger;

public class EchoTask implements Runnable, Serializable {

	@Autowired
	ThreadPoolTaskScheduler threadPoolTaskScheduler;

	private final String msg;
	private final String cronExpression;

	public EchoTask(String msg, String cronExpression) {
		this.msg = msg;
		this.cronExpression = cronExpression;
	}

	public void run() {

		threadPoolTaskScheduler.schedule(new Runnable() {

			@Override
			public void run() {

				System.out.println("Executing" + msg);

			}
		}, new CronTrigger(cronExpression));

	}
}
