package inheritance;

import java.util.StringTokenizer;

//can help when counting the number of words, or number of occurrences of a word, in a string.
public class StringTokenizerDemo {

	public static void main(String[] args) {
		int count = 0;
		String search = "is";

		String quotes = "Honesty is the best policy and is the greatest there is";
		StringTokenizer tokenizer = new StringTokenizer(quotes);

		System.out.println("Number of words in the sentence: " + tokenizer.countTokens());

		// hasMoreTokens returns true until there are no more left.
		while (tokenizer.hasMoreTokens()) {
			String temp = tokenizer.nextToken();
			if (temp.equals(search))
				count++;
		}
		System.out.println("Occurence of \"" + search + "\" in the sentence: " + count);
	}

}
