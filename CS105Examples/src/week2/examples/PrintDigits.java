package week2.examples;

import java.util.Scanner;

/**
 * 
 * Question 1:
 * Write a program which reads a 3-digit integer from the user and 
 * prints its digits one by one on the screen.
 * 
 * Question 2:
 * A palindrome number is the number that is equal to it when 
 * it is written in reverse. 121, 333, 646 are palindrome numbers. 
 * Write a program, let your program read a 3-digit integer from 
 * the user and write on the screen whether the number is palindrome or not.
 *
 */
public class PrintDigits {

	public static void main(String[] args) {
		//step1:define Scanner 
		//step2:define a variable and ask user for value 
		//step3:find first digit
		//step4:find second digit
		//step5:find third digit
		//step6:print all digits
		
		Scanner out = new Scanner(System.in);//step1
		 
		System.out.println("Please enter a 3-digit number");
		int number=out.nextInt();//step2 
		int firstDigit=number%10; // % /
		int secondDigit=(number/10)%10;
		int thirdDigit=(number/100); 
		System.out.println("First Digit:"+firstDigit);
		System.out.println("Second Digit:"+secondDigit);
		System.out.println("Third Digit:"+thirdDigit);
		
		if(firstDigit==thirdDigit)
			System.out.println(number+ " is a palindrome number");
		else
			System.out.println(number+ " is NOT a palindrome number");
	}

}
