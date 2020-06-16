package practice;

public class NumerosPrimos {

	public static void main(String[] args) {
		System.out.println("El numero primo mas alto en el rango es: " + numeroPrimoMasAlto(600851475143L));
	}

	/**
	 * 
	 * The prime factors of 13195 are 5, 7, 13 and 29.
	 * 
	 * What is the largest prime factor of the number 600851475143 ?@return
	 */
	public static Long numeroPrimoMasAlto(Long rango) {
		Long numeroPrimoMasAlto = 0L;
		for (int i = 2; i <= rango; i++) {
			System.out.println("El rango: " + rango + "  iteracion i: " + i);
			if (rango % i == 0) {
				numeroPrimoMasAlto = Long.valueOf(i);
				rango = rango / i;
				i--;
			}
		}
		return numeroPrimoMasAlto;
	}
}
