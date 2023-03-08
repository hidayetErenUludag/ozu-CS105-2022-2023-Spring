package week3.examples;

/**
 * (Perfect number) A positive integer is called a perfect number if it is equal
 * to the sum of all of its positive divisors, excluding itself. For example, 6
 * is the first perfect number because 6 = 3 + 2 + 1. The next is 28 = 14 + 7 +
 * 4 + 2 + 1. There are four perfect numbers <10,000. Write a program to find
 * all these four numbers. Find all perfect numbers less than 10000
 *
 */
public class FindPerfectNumbers {

	public static void main(String[] args) {
		// First way
//		for (int value = 1; value <= 10000; value++) {
//			int i = 1;
//			int sum = 0;
//			while (i < value) {
//				if (value % i == 0) {
//					sum = sum + i;
//				}
//				i++;
//			}
//			if (sum == value)
//				System.out.println("Perfect number:" + value);
//		}
		
		//Second way: 2 for loops
		for (int value=1;value<=10000;value++) {
			
			int sum=0;
			for(int i=1;i<value;i++) {
				if(value%i==0) {
					sum=sum+i;
				}				
			}	
			if(sum==value)
				System.out.println("Perfect number:"+value);
	}

	}

}
