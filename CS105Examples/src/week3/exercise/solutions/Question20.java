package week3.exercise.solutions;
/**
 * 
 * Create an array with the size of 100 and fill it with random integers 
 * between [1,10]. 
 * a) Find how many elements of the array are equal to 1.
 * b) Find how many elements of the array are greater than 7.
 * c) Find average of the elements of the array.
 * d) Find how many elements of the array are greater than average.
 *
 */
public class Question20 {

	public static void main(String[] args) {
		int equalTo1=0;
		int greaterThan7=0;
		int greaterThanAvg=0;
		int sum=0;
		int numbers[] = new int[100];
		double avg=0;
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = 1+(int)(Math.random()*10); //fill it with random integers 
			if(numbers[i]==1) {//(a)
				equalTo1++;
			}
			if(numbers[i]>7) {//(b)
				greaterThan7++;
			}
			sum+=numbers[i];
		}
		avg=sum*1.0/numbers.length;
		for (int i = 0; i < numbers.length; i++) {
			if(numbers[i]>avg) {
				greaterThanAvg++;
			}
		}
		System.out.println("Greater than avg:"+greaterThanAvg);
		System.out.println("Greater than 7:"+greaterThan7);
		System.out.println("Equal 1:"+equalTo1);
		System.out.println("avg:"+avg);
		
		
	}

}
