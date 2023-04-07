package homework1;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a string...");
		String str1 = scanner.nextLine();
		String str2 = str1.replaceAll(" ", "");

		int consonantCount = 0;
		String[] consonants = { "Q", "W", "R", "T", "Y", "P", "S", "D", "F", "G", "H", "J", "K", "L", "Z", "X", "C",
				"V", "B", "N", "M", "q", "w", "r", "t", "y", "p", "s", "d", "f", "g", "h", "j", "k", "l", "z", "x", "c",
				"v", "b", "n", "m" };

		int lengthOfStr = str2.length();

		for (int i = 0; i < lengthOfStr; i++) {
			String letter = str2.substring(i, i + 1);
			for (int j = 0; j < consonants.length; j++) {
				if (letter.equals(consonants[j])) {
					consonantCount++;

				}
			}

		}

		int vowelsCount = (lengthOfStr - consonantCount);
		System.out.println("Consonants: " + consonantCount + " Vowels: " + vowelsCount);
	}

}