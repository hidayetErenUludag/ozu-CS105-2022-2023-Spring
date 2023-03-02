package week2.examples;

import java.util.Scanner;

/**
 * Write a program. Your program first gets the number count from the user. 
 * After that, it should read numbers from the user, 
 * count how many of them are divisible by 3 and how many of 
 * them are divisible by 7, and write the results on the screen.
 *
 */
public class LoopDivisionExample {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number count");
		int N=input.nextInt();
		int counter=1;
		int t=0;
		int s=0;
//		while(counter<=N) {
//			System.out.println("Enter new number");
//			int number=input.nextInt();
//			if(number%3==0)
//				t++;
//			
//			if(number%7==0)
//				s++;
//			counter++;
//		}
		for(counter=1;counter<=N;counter++) {
			System.out.println("Enter new number");
			int number=input.nextInt();
			if(number%3==0)
				t++;
			
			if(number%7==0)
				s++;
		}
		System.out.println("There are "+t+ "numbers divisible by 3");
		System.out.println("There are "+s+ "numbers divisible by 7");
		
		

	}

}
