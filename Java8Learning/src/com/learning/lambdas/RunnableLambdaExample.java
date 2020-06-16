package com.learning.lambdas;

public class RunnableLambdaExample {

	public static void main(String[] args) {
		//Before
		Runnable t1 = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("thread 1");
				
			}
		};
		 
		new Thread(t1).start();
		
		//after
		
		Runnable t2 = () -> {
			System.out.println("Thread 2 java8  ");
		};
		
		new Thread(t2).start();
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				
				System.out.println("Thread 3  ");
			}
		}).start();
		
		new Thread(() ->  {
			System.out.println("Thread 4 java 8");
			System.out.println("Thread 4.1 java 8");

		}).start();
	}
	
	
	
}
