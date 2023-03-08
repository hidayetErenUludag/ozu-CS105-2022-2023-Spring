package week3.examples;

/**
 * 
 * Write a program to find the first 50 prime numbers.
 *
 */
public class FindPrimeNumbers {

	public static void main(String[] args) {
		int counter = 0;
		int number = 2;
		//while (counter < 50) {
		while (true) {
			boolean isPrime = true;
			for (int i = 2; i <= number / 2; i++) {
				if (number % i == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				counter++;
				System.out.println(counter+".prime number:"+number + " ");		
			}
			number++;
			if(counter==50)
				break;
		}

	}

}
