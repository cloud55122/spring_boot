package com.funtional.interface_.java8;
//Only one abstract method to exhibit, can have default and static methods

@FunctionalInterface
public interface TestInterface {

	public void add();
	
	default String sayHello() {
		return "Hello";
	}
	
	static boolean isTrue() {
		return true;
	}
}
