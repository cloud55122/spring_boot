package practice;

public class LargestWord {
//	Description: For this challenge you will be determining the largest word in a string.
//	Title: Longest Word
//	Solutions: 106685

	public static void main(String[] args) {
		System.out.println("larger word: " + largestWord("I love dogs"));
	}

	/**
	 * Challenge Have the function LongestWord(sen) take the sen parameter being
	 * passed and return the largest word in the string. If there are two or more
	 * words that are the same length, return the first word from the string with
	 * that length. Ignore punctuation and assume sen will not be empty. Sample Test
	 * Cases Input:"fun&!! time"
	 * 
	 * Output:time
	 * 
	 * 
	 * Input:"I love dogs"
	 * 
	 * Output:love
	 * 
	 * @param paragraph
	 * @return
	 */
	public static String largestWord(String paragraph) {
		StringBuilder largestWord = new StringBuilder();
		StringBuilder swapWord = new StringBuilder();
		for (char character : paragraph.toCharArray()) {
			int ascciCharacter = (int) character;
			if ((ascciCharacter > 64 && ascciCharacter < 91) || (ascciCharacter > 96 && ascciCharacter < 123)) {
				swapWord.append(character);
				if (swapWord.length() > largestWord.length()) {
					largestWord = swapWord;
				}
			} else {
				swapWord = new StringBuilder();
			}
		}
		return largestWord.toString();
	}
}
