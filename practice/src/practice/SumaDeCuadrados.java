package practice;

public class SumaDeCuadrados {

	public static void main(String[] args) {
		System.out.printf("diferencia: %.0f\n", diferenceBetweenSquareOfSumMinusSumOfSquares(100));

	}

	/**
	 * The sum of the squares of the first ten natural numbers is,
	 * 
	 * 12 + 22 + ... + 102 = 385 The square of the sum of the first ten natural
	 * numbers is,
	 * 
	 * (1 + 2 + ... + 10)2 = 552 = 3025 Hence the difference between the sum of the
	 * squares of the first ten natural numbers and the square of the sum is 3025 -
	 * 385 = 2640.
	 * 
	 * Find the difference between the sum of the squares of the first one hundred
	 * natural numbers and the square of the sum.
	 * 
	
	 */
	public static Double diferenceBetweenSquareOfSumMinusSumOfSquares(int range) {
		Double sumSquaresRange = 0.0;
		Double sumRangeToSquare = 0.0;
		Double diferenceBetweenSumSquaresRangeAndSumRangeToSquare = 0.0;
		for (int i = 1; i <= range; i++) {
			sumSquaresRange += Math.pow(i, 2);
			sumRangeToSquare += i;
		}
		sumRangeToSquare = Math.pow(sumRangeToSquare, 2);
		diferenceBetweenSumSquaresRangeAndSumRangeToSquare = sumRangeToSquare - sumSquaresRange;
		return diferenceBetweenSumSquaresRangeAndSumRangeToSquare;
	}

}
