package practice;

import java.util.ArrayList;
import java.util.Arrays;

public class Multiplos {

	public static void main(String[] args) {
		ArrayList<Integer> multiplos = new ArrayList<Integer>(Arrays.asList(3, 5));
		int limit = 1000;
		Long suma = sumaMultiplosN(multiplos, limit);
		System.out.println("El resultado es: " + suma);
	}

	/**
	 * La idea de este metodo es recibir una lista de multiplos y un limite y sumar
	 * todos los numeros que sean multiplos de los numeros en la lista debajo del
	 * limite establecido If we list all the natural numbers below 10 that are
	 * multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
	 * 
	 * Find the sum of all the multiples of 3 or 5 below 1000.
	 * 
	 * @param multiplos
	 * @param limit
	 */
	public static Long sumaMultiplosN(ArrayList<Integer> multiplos, int limit) {
		Long sum = 0L;
		for (int i = 1; i < limit; i++) {
			for (Integer multiplo : multiplos) {
				if (i % multiplo == 0) {
					sum += i;
					break;
				}
			}
		}
		return sum;
	}


}
