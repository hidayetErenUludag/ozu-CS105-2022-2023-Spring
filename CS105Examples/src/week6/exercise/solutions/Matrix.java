package week6.exercise.solutions;

public class Matrix {
	private int row;
	private int col;
	private double[][] data;

	public Matrix(int row, int col) {
		this.row = row;
		this.col = col;
		this.data = new double[row][col];

	}

	public int getRow() {
		return row;
	}

	public int getCol() {
		return col;
	}

	public void updateValue(int i, int j, double value) {
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
