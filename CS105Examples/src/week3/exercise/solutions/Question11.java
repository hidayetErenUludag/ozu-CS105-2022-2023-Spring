package week3.exercise.solutions;

import java.util.Scanner;

/**
 * 
 * Ask the user for the count of students and their scores. Calculate the
 * average score. Find how many student’s score is less than average score.
 * 
 * Example Scores = {65,30,90,25,76,12} Less than avg: 3
 * 
 * 
 * @author Esma Meral
 *
 */
public class Question11 {

	public static void main(String[] args) {
		Scanner out = new Scanner(System.in);
		System.out.println("Enter a number:");
		int number = out.nextInt();
		int[] scores=new int[number];
		System.out.println("Enter scores:");
		int sum=0;
		for (int i = 0; i < scores.length; i++) {
			scores[i]=out.nextInt();
			sum+=scores[i];
		}
		double avg=sum*1.0/number;
		int count=0;
		for (int i = 0; i < scores.length; i++) {
			if(scores[i]>avg)
				count++;
		}
		System.out.println(count+" scores are greater than average ("+avg+")");


	}

}
