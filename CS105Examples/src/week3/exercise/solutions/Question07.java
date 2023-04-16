package week3.exercise.solutions;
/**
 * {10, 3,  14, -22, 72, -188, 520, -1416, 3872, -10576} create the first 
 * 15 elements of this array. First 2 elements are given.  
 * Find how many elements are positive.
 * @author Esma Meral
 *
 */
public class Question07 {
public static void main(String[] args) {
	int[] array=new int[15];
	array[0]=10;
	array[1]=3;
	int counter=2;
	for (int i = 2; i < array.length; i++) {
		array[i]=(array[i-2]-array[i-1])*2;
		if(array[i]>0) {
			counter++;
			System.out.println(array[i]+" ");
		}
		
	}
	System.out.println("Positive number count:"+counter);
}
}
