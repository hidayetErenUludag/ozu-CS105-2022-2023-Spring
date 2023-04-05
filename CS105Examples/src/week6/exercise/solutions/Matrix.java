package week6.exercise.solutions;

public class Matrix {
	private int row;
	private int col;
	private int[][] data;

	public Matrix(int row, int col) {
		this.row = row;
		this.col = col;
		this.data = new int[row][col];

	}

	public int getRow() {
		return row;
	}

	public int getCol() {
		return col;
	}

	public void updateValue(int i, int j, int value) {
		data[i][j] = value;
	}

	public Matrix add(Matrix secondMatrix) {
		if (row != secondMatrix.row || col != secondMatrix.col) {
			System.out.println("Matrices cannot be added");
			return null;
		}
		Matrix matrixSum = new Matrix(row, col);
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				matrixSum.data[i][j] = this.data[i][j] + secondMatrix.data[i][j];
			}
			
		}
		return matrixSum;
		
	}
	public Matrix multiply(Matrix secondMatrix) {
		if (data[0].length!=secondMatrix.col) {
			System.out.println("Matrices cannot be multiplied");
			return null;
		}
		Matrix matrixMult = new Matrix(row, secondMatrix.col);
		
		for (int k = 0; k < data[0].length; k++) {
	
			
			for (int i = 0; i < secondMatrix.row; i++) {
				System.out.print("t["+k+"]["+i+"]=");
				int sum=0;
				for (int j = 0; j < data[0].length; j++) {
					sum+=data[k][j]*secondMatrix.data[j][i];
				}
				matrixMult.data[k][i]=sum;
				System.out.println();
				
			}
			
			
		}
		
		
		
		
		return matrixMult;

	}

	public  void print() {
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(data[i][j]+"  ");
			}
			System.out.println();

		}
		
	}

//	5. multiplying the two matrices

}
