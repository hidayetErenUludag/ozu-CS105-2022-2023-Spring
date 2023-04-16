package week3.exercise.solutions;

/**
 * Question9: Suppose you have an int array. If your array contains at least one
 * even number, your program should print "The array contains an even integer",
 * otherwise it should print "No even integers in the array".
 * 
 * Question 10: Suppose that you have a double array. If all of elements are
 * positive your program should print “Hey, this is a positive array” otherwise
 * it should print “this array contains negative numbers”
 * 
 * @author Esma Meral
 *
 */
public class Question9_and_10 {

	public static void main(String[] args) {
		int[] arr1 = { 2, 4, 3, 9, 12, 7 };
		int[] arr2 = { 1, 3, 5, 9, 11 };
		double[] arr3 = { 1, -1, 5, -9, 11, -23, -14 };
		double[] arr4 = { 1, 31, 5, 19, 11, 23, 14 };
		question9(arr1);
		question9(arr2);
		question10(arr3);
		question10(arr4);

	}

	public static void question9(int[] array) {
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				System.out.println("The array contains an even integer");
				return;
			}
		}
		System.out.println("No even integers in the array");
	}

	public static void question10(double[] array) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] <0) {
				System.out.println("this array contains negative numbers");
				return;
			}
		}
		System.out.println("Hey, this is a positive array");
	}

}
