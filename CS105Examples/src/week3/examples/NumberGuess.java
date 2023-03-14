package week3.examples;

import java.util.Scanner;
/**
 * 
 * Generate a random number and don’t display that number user. 
 * Let the user repeatedly guess a number until it is correct. 
 * The problem is to guess what number a computer has in mind. 
 * You will write a program that randomly generates an integer between 10 and 99, 
 * inclusive. 
 * The program prompts the user to enter a number continuously until the number 
 * matches the randomly generated number. For each user input, 
 * the program tells the user whether the input is too low or too high, 
 * so the user can make the next guess intelligently
 *
 */
public class NumberGuess {

	public static void main(String[] args) {
	

		int random = (int)(Math.random()*90)+10;
		
		Scanner input = new Scanner(System.in);
		int i=0;
		while (true) {
			System.out.println("Enter your guess:");
			int userValue = input.nextInt();
			i++;
			if (userValue > random) 
				System.out.println("Your guess is too high");
			 else if (userValue < random) 
				System.out.println("Your guess is too low");
			 else {
				System.out.println("Congratulations "+i);
				break;
			}

		}

	}

}
