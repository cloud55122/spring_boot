package practice;

import javax.sound.sampled.ReverbType;

public class Palindrome {

	public static void main(String[] args) {
//		System.out.println("El palindrome mas alto para el numero es: " + palindromeMasGrandeXRango(99));
		
//		System.out.println("El palindrome mas alto para el producto de 2 numeros entre el rango es : " + palindromeMasGrandeProductoXRango(999));
		
		reverseStringRemovingPuntationAndNumbers("never odd or even");
	}
	
	public static long palindromeMasGrandeXRango(int rango) {
		long palindromeMasAlto = 0L;
		for(long i = 10; i <= rango ; i++) {
			long reverse = reserveNumber(i);
			if (i == reverse) {
				palindromeMasAlto = i;
			}
		}
		return palindromeMasAlto;
	}
	
	public static long palindromeMasGrandeProductoXRango(long rango) {
		long palindromeMasGrandeTemp = 0L;
		long palindromeMasGrande = 0L;
		for (long i = rango ; i>=100; i--) {
			long iterador = i ;
			while(palindromeMasGrandeTemp == 0 && iterador > 100 ) {
				long producto = rango * iterador;
				if(reserveNumber(producto) == producto) {
					System.out.println("palindrome mas alto : " + producto);
					palindromeMasGrandeTemp = producto;
				}
				iterador--;
			}
			if(palindromeMasGrandeTemp > palindromeMasGrande) {
				palindromeMasGrande = palindromeMasGrandeTemp;
			}		
			palindromeMasGrandeTemp = 0L;
			rango--;
		}
		return palindromeMasGrande;
		
	}
	
	public static long reserveNumber(long number) {
		return Long.valueOf(new StringBuilder(String.valueOf(number)).reverse().toString());
	}
	public static boolean reverseStringRemovingPuntationAndNumbers(String str) {
		
		str = str.replaceAll("[^a-zA-Z ]", "").toLowerCase();
		str = str.replaceAll("\\s","");
		String reverse = new StringBuilder(str).reverse().toString();
		if(reverse.equals(str)) {
			return true;
		}
		return false;
	}


}	
