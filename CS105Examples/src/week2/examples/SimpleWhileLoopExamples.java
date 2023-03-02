package week2.examples;

import java.util.Scanner;

public class SimpleWhileLoopExamples {

	public static void main(String[] args) {
		/*
		 * Step 1: Write a program that repeatedly asks the user for an integer and
		 * calculates the sum of those numbers. When the total exceeds 100, your program
		 * should stop asking for a new integer 
		 * Step 2: and print the number count and
		 * average of the numbers to the screen.
		 */
		Scanner input = new Scanner(System.in);
		int total = 0;
		int counter=0;
//		while (total < 100) {
//			System.out.println("Enter an integer");
//			int value = input.nextInt();
//			counter+=1;
//			total = total + value;
//		}
//		System.out.println("Total:"+total);
//		System.out.println("Number count:"+counter);
//		double avg=(double)total/counter;
//		System.out.println("Avg:"+avg);
		System.out.println("SECOND WAY...");
		do {
			System.out.println("Enter an integer");
			int value = input.nextInt();
			counter+=1;
			total = total + value;
		} while (total < 100);
		
		System.out.println("Total:"+total);
		System.out.println("Number count:"+counter);
		double avg=(double)total/counter;
		System.out.println("Avg:"+avg);
		

	}

}
