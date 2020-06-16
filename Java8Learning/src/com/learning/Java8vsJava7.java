package com.learning;

import java.util.stream.IntStream;

public class Java8vsJava7 {

	public static void main(String[] args) {
		//sum of number from 0-50
		//before
		int total = 0;
		for(int i = 0 ; i <= 50; i++) {
			total += i;
		}
		System.out.println("Total en java7: " + total);
		
		//after java8
		int total_Java8 = IntStream.rangeClosed(0, 50).sum();
		
		System.out.println("Total en java 8: " + total_Java8);
	}
}
