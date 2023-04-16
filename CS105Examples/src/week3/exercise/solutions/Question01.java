package week3.exercise.solutions;

import java.util.Scanner;

/**
 * Write a program that asks user for a number. Check that number is a prime number or not. 
 * @author Esma Meral
 *
 */
public class Question01 {

	public static void main(String[] args) {
		Scanner out = new Scanner(System.in);
		System.out.println("Enter a number:");
		int number = out.nextInt();
		boolean isPrime = true;
		for (int i = 2; i <= number / 2; i++) {
			if (number % i == 0) {
				isPrime = false;
				break;
			}
		}
		if(isPrime)
			System.out.println(number+" a prime number");
		else
			System.out.println(number+" is not a prime number");

	}

}
