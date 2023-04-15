package week4.exercise.solutions;

import java.util.Scanner;

/**
 * How to find all pairs on integer array whose sum is equal to given number
 * 
 * @author Esma Meral
 *
 */
public class Question8 {

	public static void main(String[] args) {
		Scanner out = new Scanner(System.in);
		int[] array = { 9,1, 2, 8, 7, 3, 4,5, 5, 6 };

		System.out.println("Please enter an integer:");
		int number = out.nextInt();
		for (int i = 0; i < array.length-1; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] + array[j] == number)
					System.out.println("{"+array[i]+"," + array[j]+"}="+number);
			}
		}

	}

}
