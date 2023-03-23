package week4.exercise.solutions;

/**
 * Write a method that takes 2 parameters: two-dimensional array(matrix) and
 * column number. The method should return a one-dimensional array containing
 * the corresponding column. If your matrix is
 * {{1,2,3,4,5},{11,3,8,9,12},{22,33,44,1,98}} and column number is 2 then
 * method should return {3,8,44}. You should check the element count of each
 * row. If counts are not equal, you should display an error message
 * 
 * @author Esma Meral
 *
 */
public class Question4 {

	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3, 4, 5 }, { 11, 3, 8, 9, 12 }, { 22, 33, 44, 1, 98 } };
		int sizeOfRow=matrix[0].length;
		//Check the element count of each row
		for (int i = 1; i < matrix.length; i++) {
			if(sizeOfRow!=matrix[i].length) {
				System.out.println("element count of each row must be same");
				return;
			}
			
		}
		int[] newArr = getColumn(matrix, 3);
		
		for (int i : newArr) {
			System.out.print(i + " ");
		}
	}

	private static int[] getColumn(int[][] matrix, int col) {
		int[] newArr = new int[matrix.length];
		for (int i = 0; i < matrix.length; i++) {
			newArr[i] = matrix[i][col];
		}
		return newArr;
	}

}
