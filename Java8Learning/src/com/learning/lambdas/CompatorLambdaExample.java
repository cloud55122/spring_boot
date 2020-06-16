package com.learning.lambdas;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

public class CompatorLambdaExample {

	public static void main(String[] args) {
		// before
		Comparator c1 = new Comparator<Integer>() {

			@Override
			public int compare(Integer x, Integer y) {
				return x.compareTo(y);
			}

		};
		
		System.out.println("Comparador1 : " + c1.compare(15, 15));


		// after
		Comparator<Integer> c2 = (x, y) -> x.compareTo(y);

		System.out.println("Comparador2 : " + c2.compare(15, 15));

	}
}
