package week4.exercise.solutions;
/**
 * 
 * @author Murat Ozvin
 *
 */

public class Question9 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] mat1 = {{1, 3, 2, 7, 3},
	                  {10, 10, 4, 6, 2},
	                  {5, 3, 5, 9, 6},
	                  {7, 6, 4, 2, 1}};
	
		boolean isMat1Diverse = isDiverse(mat1);
		System.out.println("Is Mat1 diverse : " + isMat1Diverse);

		int[][] mat2 = {{1, 1, 5, 3, 4},
						{12, 7, 6, 1, 9},
						{8, 11, 10, 2, 5},
						{3, 2, 3, 0 ,6}};

		boolean isMat2Diverse = isDiverse(mat2);
		System.out.println("Is Mat2 diverse : " + isMat2Diverse);

	}
	
	public static boolean isDiverse(int[][] matr)
	{
		/*
		 * I will check each rows.
		 * I will sum their each row values.
		 * I will check whether the sums are unique or not. -->
		 * Then;
		 * I need an int array.
		 * I need an for loop. (At least one.)
		 * I need another for loop inside of each row.
		 */
		
		int[] rowSums = new int[matr.length];
				
		for (int row = 0; row < matr.length; row++)
		{
			for (int col = 0; col < matr[0].length; col++)
			{
				rowSums[row] += matr[row][col];
			}
		}
		
		// In the code above, I found the array of sums each row.
		
		
		// In the code below: I will check uniqueness of the rowSums.
		
		for (int i = 0; i < rowSums.length; i++)
		{
			for (int j = 0; j < rowSums.length; j++)
			{
				if ( rowSums[i] == rowSums[j] && i != j)
				{
					// I found a non-unique match.
					return false;
				}

			}
		}
		
		// How about return true?, where should I put it?

		// Important point : I checked every element for uniqueness condition,
		// However, I could not find any element. Then, the matrix must satisfy the
		// diversity condition.
		return true;
	}

}

