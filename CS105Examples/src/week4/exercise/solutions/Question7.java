package week4.exercise.solutions;
/**
 * 
 * @author Murat Ozvin
 *
 */
public class Question7 {


	public static void main(String[] args) {
		
		countOnesSubstring();
	}
	
	public static void countOnesSubstring() {
		/*
		 * This function counts the number of substring between
		 * two 1 in a binary string.
		 */
		
		//String input = "00100101";
		String input = "0010010101";
		/*
		 * The expected count for input = "0010010101" is 6 because:
		 * 1001, 101, 101, 100101, 10010101, 10101
		 */

		int count = 0;
		
		for (int startIndex = 0; startIndex < input.length(); startIndex++) {
			for (int endIndex = startIndex; endIndex < input.length(); endIndex++)
			{
				if(input.charAt(startIndex) == '1' &&
						input.charAt(endIndex) == '1' &&
						startIndex != endIndex)
				{
					// Increase the count.
					count++;
				}
					
			}

		}
		
		String[] subarr = new String[count];
		int index = 0;
				for (int startIndex = 0; startIndex < input.length(); startIndex++) {
					for (int endIndex = startIndex; endIndex < input.length(); endIndex++)
					{
						if(input.charAt(startIndex) == '1' &&
								input.charAt(endIndex) == '1' &&
								startIndex != endIndex)
						{
							// substring methods excludes the endindex, so we increase it by 1.
							subarr[index] = input.substring(startIndex, endIndex + 1);
							index++;
						}
							
					}
				}
				
		
		System.out.println("The count is " + count);
		System.out.println("The substrings are ");
		for (String a : subarr) {
			System.out.print(a + ',');
		}
	}

}

