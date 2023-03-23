package week4.exercise.solutions;

/**
 * Write a method for swapping elements in an array. Your method should take a
 * one-dimensional array as parameter and should return nothing. Call your
 * method in the main() with an arbitrary int array. Print array elements on the
 * screen. In this example you will test call-by-value feature (passing an
 * object reference). Don’t create a new array in the method. If your array is
 * {1,2,3,4,5,6,7,8} then after method calling your array should be
 * {2,1,4,3,6,5,8,7}
 * 
 * @author esma_
 *
 */
public class Question2 {

	public static void main(String[] args) {
		int[] array = {1,2,3,4,5,6,7,8,9};
		System.out.println("Before swap:");
		printArray(array);
		swapArrayElements(array);
		System.out.println();
		System.out.println("After swap:");
		printArray(array);

	}
	private static void printArray(int[] newArray) {
		for (int i : newArray) {
			System.out.print(i + " ");
		}
	}

	private static void swapArrayElements(int[] array) {
		for (int i = 0; i < array.length; i+=2) {
			if(i+1>=array.length) {
				return;
			}
			int tmp=array[i];
			array[i]=array[i+1];
			array[i+1]=tmp;
		}
		
	}

}
