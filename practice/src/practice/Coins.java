package practice;

public class Coins {
	
	public static void main(String[] args) {
		System.out.println("Menor cantidad de monedas : " + lessCoinsNeedIt(12));
	}

	/**
	 * Have the function CoinDeterminer(num) take the input, which will be an
	 * integer ranging from 1 to 250, and return an integer output that will specify
	 * the least number of coins, that when added, equal the input integer. Coins
	 * are based on a system as follows: there are coins representing the integers
	 * 1, 5, 7, 9, and 11. So for example: if num is 16, then the output should be 2
	 * because you can achieve the number 16 with the coins 9 and 7. If num is 25,
	 * then the output should be 3 because you can achieve 25 with either 11, 9, and
	 * 5 coins or with 9, 9, and 7 coins.
	 */
	
	public static int lessCoinsNeedIt(int num) {
		int coins = 0;
		while(num > 0) {
			if(num > 0 && num - 11 >=0 && (num -11 > 16 || num -11 == 1 )) {
				if(num -11 != 16 && num -11 != 14 && num -11 != 13) {
					num -= 11;
					coins++;
					continue;
				}
				
			}
			if(num > 0 && num - 9 >=0 && (num -9 != 13 || num - 9 == 1)) {
				num -= 9;
				coins++;
				continue;
			}
			if(num > 0 && num - 7 >=0 ) {
				num -= 7;
				coins++;
				continue;
			}
			if(num > 0 && num - 5 >=0) {
				num -= 5;
				coins++;
				continue;
			}
			if(num > 0 && num - 1 >=0) {
				num -= 1;
				coins++;
				continue;
			}
		}
		return coins;
	}
	
	
}
