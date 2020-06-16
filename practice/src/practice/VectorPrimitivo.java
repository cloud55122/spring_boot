package practice;

import java.util.UUID;

public class VectorPrimitivo {

	public static void main(String[] args) {
		int vectorPrimitivo[] = new int[10];
		String matriz[][] = new String [10][10];
		
//		for(int i=0; i<vectorPrimitivo.length ; i++) {
//			
//			vectorPrimitivo[i]= i * 2; 
//		}
//		
//		for (int i=0; i<vectorPrimitivo.length ; i++) {
//			System.out.println("Vector en la posicion "  + i + " valor: " + vectorPrimitivo[i]);
//		}
		
		for(int i=0; i<matriz.length ; i++) {
			for(int j=0; j<matriz[i].length ; j++) {
				matriz[i][j] = UUID.randomUUID().toString();
			}
		}
		
		for(int i=0; i<matriz.length ; i++) {
			for(int j=0; j<matriz[i].length ; j++) {
				System.out.println("el valor de la matriz en la posicion : " + i + ", " + j + " es = " + matriz[i][j]);
			}
		}
		
	}
	
}
