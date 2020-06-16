package com.scheduler;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ScheduledFuture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.TaskScheduler;
import org.springframework.scheduling.annotation.ScheduledAnnotationBeanPostProcessor;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;
import org.springframework.scheduling.support.CronTrigger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.core.IMap;
import com.hazelcast.core.Member;
import com.hazelcast.scheduledexecutor.IScheduledExecutorService;
import com.hazelcast.scheduledexecutor.IScheduledFuture;
import com.hazelcast.scheduledexecutor.ScheduledTaskHandler;
import com.hazelcast.scheduledexecutor.impl.ScheduledFutureProxy;

@Controller
@RequestMapping("/scheduler")
public class SchedulerController {
	private transient IMap<Object, ScheduledFuture<?>> scheduledTasks;

	@Autowired
	private ScheduledAnnotationBeanPostProcessor postProcessor;

	@Autowired
	private ExampleScheduler exampleScheduler;

	@Autowired
	private ThreadPoolTaskScheduler threadPoolTaskScheduler;

	@Autowired
	private HazelcastInstance hazelcastInstance;

	@RequestMapping(value = "/start", method = RequestMethod.GET)
	public ResponseEntity startAgent(@RequestParam(value = "name", required = true) String name) throws Exception {
		try {
			CronTrigger cronTrigger = new CronTrigger("0 0/1 * * * *");
			if (!getHazelcastSchedulerMap().containsKey(exampleScheduler)) {
				getHazelcastSchedulerMap().put(exampleScheduler,
						threadPoolTaskScheduler.schedule(exampleScheduler, cronTrigger));
			} else {

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return new ResponseEntity("Ok", HttpStatus.OK);
	}

//    @RequestMapping(value = "/stop", method = RequestMethod.GET)
//    public ResponseEntity  stoptAgent(@RequestParam(value = "name", required = true) String name) throws Exception {
//        try {
//        	ScheduledFuture<?> scheduledTask = getHazelcastSchedulerMap().get(exampleScheduler);
//        	if(scheduledTask != null) {
//        		scheduledTask.cancel(true);
//        		getHazelcastSchedulerMap().remove(exampleScheduler);
//        	}
//        }catch (Exception e) {
//            e.printStackTrace();
//        }
//        
//        return new ResponseEntity("Ok", HttpStatus.OK);
//    }
	@RequestMapping(value = "/stop", method = RequestMethod.GET)
	public ResponseEntity stoptAgent(@RequestParam(value = "name", required = true) String name) throws Exception {
		try {
			IScheduledExecutorService scheduler = hazelcastInstance.getScheduledExecutorService("scheduler");
			for (Entry<Member, List<IScheduledFuture<Object>>> o : scheduler.getAllScheduledFutures().entrySet()) {

				ScheduledTaskHandler handler = ((ScheduledFutureProxy) o.getValue().toArray()[0]).getHandler();
				if (handler.getTaskName().equals("task")) {
					System.out.println("Cancelling Task:" + handler.getTaskName());
					IScheduledFuture<Object> scheduledFuture = scheduler
							.getScheduledFuture(handler);
					boolean cancel = scheduledFuture.cancel(false);
					System.out.println("Cancelled Task:" + cancel);
					scheduledFuture.dispose();
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return new ResponseEntity("Ok", HttpStatus.OK);
	}
//    @RequestMapping(value = "/stop", method = RequestMethod.GET)
//    public ResponseEntity  stoptAgent(@RequestParam(value = "name", required = true) String name) throws Exception {
//        try {
//        	IScheduledExecutorService scheduledExecutorService = hazelcastInstance.getScheduledExecutorService("scheduler");
//        	Map<Member, List<IScheduledFuture<Object>>> allScheduledFutures = scheduledExecutorService.getAllScheduledFutures();
//            allScheduledFutures.values().forEach(
//                iScheduledFutures -> iScheduledFutures.forEach(objectIScheduledFuture -> {
//                      ScheduledTaskHandler handler = objectIScheduledFuture.getHandler();
//                      if (handler.getTaskName().equals("task")) {
//                        System.out.println("Cancelling Task:" + objectIScheduledFuture.getHandler().getTaskName());
//                        IScheduledFuture<Object> scheduledFuture = scheduledExecutorService.getScheduledFuture(objectIScheduledFuture.getHandler());
//                        boolean cancel = scheduledFuture.cancel(false);
//                        System.out.println("Cancelled Task:" + cancel);
//                        scheduledFuture.dispose();
//                      }
//                    }
//                )
//            );
//
//        	
//        }catch (Exception e) {
//            e.printStackTrace();
//        }
//        
//	return new ResponseEntity("Ok",HttpStatus.OK);
//
//	}

	public IMap<Object, ScheduledFuture<?>> getHazelcastSchedulerMap() {
		if (this.scheduledTasks == null) {
			this.scheduledTasks = hazelcastInstance.getMap("HazelcastSchedulerMap");
		}
		return this.scheduledTasks;

	}
}
