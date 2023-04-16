package week3.exercise.solutions;
/**
 * Write a program for combining two arrays
Example
First array : {6,3,9,2,5}
Second array: {13,1,7}
Last Array: {6,3,9,2,5,13,1,7}

 * @author Esma Meral
 *
 */
public class Question08 {

	public static void main(String[] args) {
		int[] firstArray={6,3,9,2,5};
		int[] secondArray={13,1,7};
		int[] combinedArray=new int[firstArray.length+secondArray.length];
		for (int i = 0; i < firstArray.length; i++) {
			combinedArray[i]=firstArray[i];
		}
		for (int i = 0; i < secondArray.length; i++) {
			combinedArray[firstArray.length+i]=secondArray[i];
		}
		System.out.println("Combined Array");
		for (int i = 0; i < combinedArray.length; i++) {
			System.out.print(combinedArray[i]+" ");
		}

	}

}
