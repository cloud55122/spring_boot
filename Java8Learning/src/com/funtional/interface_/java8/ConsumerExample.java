package com.funtional.interface_.java8;

import java.util.function.Consumer;

public class ConsumerExample {
	
	public static void main(String[] args) {
		Consumer<String> cons1 = (s) -> {
			System.out.println("System : " + s.toUpperCase());
			};
//		cons1.accept("java8");
		Consumer<String> cons2 = (s) -> System.out.println("System : " + s.toLowerCase());
//		cons2.accept("java8");
		
		cons1.andThen(cons2).accept("java8");;
	}

}
