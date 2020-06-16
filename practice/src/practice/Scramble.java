package practice;

import java.util.HashMap;
import java.util.Map;

public class Scramble {
	
	public static void main(String[] args) {
		System.out.println("Is scramble: " + isStringScramble("coodrebtqqkye", "coderbyte"));
	}

	/**
	 * Have the function StringScramble(str1,str2) take both parameters being passed
	 * and return the string true if a portion of str1 characters can be rearranged
	 * to match str2, otherwise return the string false. For example: if str1 is
	 * "rkqodlw" and str2 is "world" the output should return true. Punctuation and
	 * symbols will not be entered with the parameters.
	 */
	
	public static boolean isStringScramble(String str1, String str2) {
		HashMap<Character, Integer> palabra1 = new  HashMap<Character, Integer>();
		HashMap<Character, Integer> palabra2 = new  HashMap<Character, Integer>();
		boolean isScramble = true;
		for(Character c: str1.toCharArray()) {
			if(palabra1.containsKey(c)) {
				palabra1.put(c, palabra1.get(c) + 1);
			}else {
				palabra1.put(c, 1);
			}
		}
		for(Character c: str2.toCharArray()) {
			if(palabra2.containsKey(c)) {
				palabra2.put(c, palabra2.get(c) + 1);
			}else {
				palabra2.put(c, 1);
			}
		}
		for(Map.Entry<Character,Integer> entry: palabra2.entrySet()) {
			if(palabra1.containsKey(entry.getKey())) {
				if(palabra1.get(entry.getKey()) < entry.getValue()) {
					isScramble = false;
				}
			}else {
				isScramble = false;
			}
		}
			
		return isScramble;
	}
}
