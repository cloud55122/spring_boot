package practice;

public class NumerosRepeditosEnArregloPrimitivo {

	public static void main(String[] args) {
		int vectorPrimitivo[] = new int[] {2,3,4,3,2,1};
		int givenNumber = 3;
		int count = 0;
		for(int value:vectorPrimitivo) {
			if(givenNumber == value) {
				count++;
			}
		}
		System.out.println("Numero de veces que se encuentra el numero en el vector: "+ count);
	}
}
