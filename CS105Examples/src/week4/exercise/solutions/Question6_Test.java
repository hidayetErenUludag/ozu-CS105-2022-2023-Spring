package week4.exercise.solutions;

import java.util.Scanner;

public class Question6_Test {
public static void main(String[] args) {
	Scanner out = new Scanner(System.in);
	

	System.out.println("Row count:");
	int row = out.nextInt();
	System.out.println("Col count:");
	int col = out.nextInt();
	double a[][]=new double[row][col];
	System.out.println("Please enter array values");
	for (int i = 0; i < row; i++) {
		for (int j = 0; j < col; j++) {
			a[i][j]=out.nextDouble();
		}
	}
	Location location=Location.locateLargest(a);
	System.out.println("The location of the largest element is "+location.getMaxValue()+" at ("+location.getRow()+","+location.getColumn()+")");
}
}
