package week3.exercise.solutions;

import java.util.Scanner;

/**
 * 
 * Write a program that generates a random two-digit number, prompts the user to
 * enter a two-digit number, and determines whether the user wins according to
 * the following rules: <br/>
 * 1. If the user input matches the lottery number in the exact order, the award
 * is $10,000. <br/>
 * 2. If all the digits in the user input match all the digits in the lottery
 * number, the award is $3,000. <br/>
 * 3. If one digit in the user input matches a digit in the lottery number, the
 * award is $1,000.
 *
 * 
 */
public class Question12 {

	public static void main(String[] args) {

		int random = (int) (Math.random() * 90) + 10;
		System.out.println(random);
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your guess:");
		int userValue = input.nextInt();
		int userFirstDigit = userValue % 10;
		int userSecondDigit = userValue / 10;

		int randomFirstDigit = random % 10;
		int randomSecondDigit = random / 10;
		System.out.println("The lottery number is " + random);
		if (userValue == random) {
			System.out.println("Exact match: you win $10,000");
		} else if (randomFirstDigit == userSecondDigit && randomSecondDigit == userFirstDigit) {
			System.out.println("Match all digits: you win $3,000");
		} else if (randomFirstDigit == userSecondDigit || randomSecondDigit == userFirstDigit) {
			System.out.println("Match one digit: you win $1,000");
		} else {
			System.out.println("Sorry: no match");
		}

	}

}
