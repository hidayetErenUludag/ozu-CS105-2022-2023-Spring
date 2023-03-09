package week3.examples;

import java.util.List;
import java.util.Scanner;

public class ArrayExamples {

	public static void main(String[] args) {
		int[] numbers = new int[5];
		numbers[0] = 67;
		numbers[4] = 17;
		numbers[2] = 2;
		System.out.println(numbers.length);

		System.out.println("....Values....");
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}

		System.out.println("....Values....");
		for (int value : numbers) {
			System.out.println(value);
		}

		double[] values[] = new double[3][4];
		values[1][3] = 3;
		values[0][0] = 2;
		values[1][2] = 4;
		values[2][3] = 8;
		System.out.println(values.length);
		System.out.println("First Loop");
		for (double[] row : values) {

			for (double anElement : row) {
				System.out.print(anElement + " ");
			}
			System.out.println();
		}
		System.out.println("Second Loop");
		for (int i = 0; i < values.length; i++) {
			for (int j = 0; j < values[i].length; j++) {
				System.out.print(values[i][j]+" ");
			}
			System.out.println();
		}

	}

}
