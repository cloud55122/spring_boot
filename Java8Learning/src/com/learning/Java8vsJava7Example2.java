package com.learning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Java8vsJava7Example2 {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("sam", "carlos", "manuel", "sam");
		
		//before
		List<String> uniqueNames = new ArrayList<String>();
		for(String name: names) {
			if(!uniqueNames.contains(name)) {
				uniqueNames.add(name);
			}
		}
		System.out.println("Unique list java 7" + uniqueNames);
		//after
		List<String> uniqueNamesJava8 = names.stream().distinct().collect(Collectors.toList());
		
		System.out.println("Unique list java 8" + uniqueNamesJava8);
	}
}
