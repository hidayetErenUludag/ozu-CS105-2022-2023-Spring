package week6.exercise.solutions;

public class Week6Question4Test {

	public static void main(String[] args) {
		int row = 2;
		int col = 2;
		Matrix m1 = new Matrix(2, 2);
		fillMatrix(m1);
		System.out.println("FIRST MATRIX");
		m1.print();

		Matrix m2 = new Matrix(2, 2);
		fillMatrix(m2);
		System.out.println("SECOND MATRIX");
		m2.print();
		Matrix matrixSum = m1.add(m2);
		System.out.println("SUM OF THEM");
		matrixSum.print();
		
		Matrix matrixMult = m1.multiply(m2);
		System.out.println("MULTIPLY OF THEM");
		matrixMult.print();

	}

	private static void fillMatrix(Matrix m) {
		for (int i = 0; i < m.getRow(); i++) {

			for (int j = 0; j < m.getCol(); j++) {
				m.updateValue(i, j, (int) (Math.random() * 10)) ;
			}

		}
	}
}
