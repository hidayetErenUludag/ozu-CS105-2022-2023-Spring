package week1.examples;

import java.util.Scanner;

/**
 * Write a program which takes the principal amount, interest rate and duration
 * from the keyboard and calculates the monthly interest.
 */
public class CalculateInterestAmount {

	public static void main(String[] args) {

		// Interest Amount= principal * duration * InterestRate / 1200
		// step 1: define variables
		// step 2: get values from user (assign fix values)
		// step 3: calculate the interestAmount
		// TODO step 3.1: optional : format amount (only two digits after decimal point)
		// step 4: print interestAmount on the screen
		// output format:
		// You will earn an interest of 56.6666 TL in 5 months with 8.5%
		// interest rate over 1600.0 TL
		Scanner input= new Scanner(System.in);
		System.out.println("Enter your principle amount");
		double principle = input.nextDouble();
		
		System.out.println("Enter your interest rate");
		double interestRate = input.nextDouble();
		
		System.out.println("Enter your duration");
		int duration = input.nextInt();
		double interestAmount = principle * duration * interestRate / 1200;
		
		double formattedInterestAmount = ((int) (interestAmount * 100)) / 100.0;
		System.out.print("You will earn an interest of " + formattedInterestAmount + " TL ");
		System.out.println(
				"in " + duration + " months with " + interestRate + "% interest rate over " + principle + " TL");

	}

}
