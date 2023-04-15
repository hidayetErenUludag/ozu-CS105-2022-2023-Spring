package week3.exercise.solutions;

import java.util.Scanner;

/**
 * Write a program which takes the size and the values of the array from 
 * the user, and finds the number of elements which are divisible by 5. 
 * Put these values into a new array
 * @author Esma Meral
 *
 */
public class Question5 {

	public static void main(String[] args) {
		Scanner out = new Scanner(System.in);
		System.out.println("Enter size of the array:");
		int size = out.nextInt();
		System.out.println("Enter values:");
		int[] a=new int[size];
		int count=0;
		for (int i = 0; i < a.length; i++) {
			a[i]=out.nextInt();
			if(a[i]%5==0)
				count++;
		}
		int[] result=new int[count];
		int j=0;
		for (int i = 0; i < a.length; i++) {
			
			if(a[i]%5==0) {
				result[j]=a[i];
				j++;}
		}
		for (int i = 0; i < count; i++) {
			System.out.print(result[i]+"  ");
		}

	}

}
