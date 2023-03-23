package week4.exercise.solutions;

/**
 * Write 2 methods: First method takes a one-dimensional array as a parameter
 * and returns the elements which are greater than average. The second method
 * takes a one-dimensional array and prints its elements on the screen. Call
 * your methods from main() method.
 * 
 * @author esma meral
 *
 */
public class Question1 {
	public static void main(String[] args) {
		int[] array = { 3, 4, 6, 1, 9, 34, 12, 31 };
		int newArray[] = elementsGreaterThanAverage(array);
		printArray(newArray);

	}

	private static void printArray(int[] newArray) {
		for (int i : newArray) {
			System.out.println(i + " ");
		}
	}

	public static int[] elementsGreaterThanAverage(int[] arr) {
		double sum = 0;
		int count = 0;
		int i = 0;
		for (int x : arr) {
			sum += x;
		}
		double average = sum / arr.length;
		for (int a : arr) {
			if (a > average)
				count++;
		}

		int[] newArray = new int[count];

		for (int a : arr) {
			if (a > average) {
				newArray[i] = a;
				i++;
			}
		}
		return newArray;
	}
}
