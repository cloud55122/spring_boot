package practice;

public class NumerosDivisibles {

	public static void main(String[] args) {
		System.out.println("El numero mas pequeño en rango: " + smallerDivisibleNumberRange(20));
	}

	/**
	 * 2520 is the smallest number that can be divided by each of the numbers from 1
	 * to 10 without any remainder. What is the smallest positive number that is
	 * evenly divisible by all of the numbers from 1 to 20?
	 * 
	 */
	public static long smallerDivisibleNumberRange(int range) {

		int pivoteNumber = range;
		long smallerNumberDivisibleInRange = 0L;
		while (smallerNumberDivisibleInRange == 0) {
			boolean divisibleByRange = true;
			for (int i = 1; i <= range; i++) {
				if (pivoteNumber % i != 0) {
					divisibleByRange = false;
					break;
				}
			}
			if (divisibleByRange) {
				smallerNumberDivisibleInRange = pivoteNumber;
				break;
			}
			pivoteNumber++;
		}

		return smallerNumberDivisibleInRange;

	}

}
