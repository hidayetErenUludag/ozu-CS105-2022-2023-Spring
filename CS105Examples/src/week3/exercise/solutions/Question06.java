package week3.exercise.solutions;

/**
 * 
 * {500.0, 250.0, 125.0, 62.5, 31.25, ….} create the first 20 elements of this
 * array. Find how many of the elements are integer and how many of them are <1.
 *
 */
public class Question06 {

	public static void main(String[] args) {
		double[] list = new double[20];
		list[0] = 500;
		for (int i = 1; i <= 19; i++) {
			list[i] = list[i - 1] / 2;

		}

		for (int j = 0; j <= 19; j++) {
			System.out.print(list[j] + " ");
		}

		int integerCount = 0;
		int lessThan1 = 0;

		for (double value : list) {
			if (1 > value) {
				lessThan1++;
			}
			if ((int) value == value) {
				integerCount++;
			}
		}
		System.out.println();
		System.out.println("Integer Counter: " + integerCount);
		System.out.println("Less Than 1: " + lessThan1);
	}

}
