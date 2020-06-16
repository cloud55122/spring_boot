package com.learning;

import java.util.Arrays;

public class OcurrencesOfNumberInArrayPrimitive {
	public static void main(String[] args) {
		int vectorPrimitivo[] = new int[] {2,3,4,3,2,1};
		int givenNumber = 3;
	
		long count = Arrays.stream(vectorPrimitivo).filter(x -> x == givenNumber).count();
		System.out.println("Numero de veces que se encuentra el numero en el vector: "+ count);
	}
}
