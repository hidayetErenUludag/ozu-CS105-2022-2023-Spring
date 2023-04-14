package homework2;

public class TemperatureGrid {
	/**
	 * A two-dimensional array of temperature values, initialized in the constructor
	 * (not shown) Guaranteed not to be null
	 */
	private double[][] temps;
	private double[][] updatedTemps;

	public TemperatureGrid(double[][] t) {
		super();
		temps = t;
		updatedTemps=t;

	}

	/**
	 * Computes and returns a new temperature value for the given location.
	 * 
	 * @param row a valid row index in temps
	 * @param col a valid column index in temps
	 * @return the new temperature for temps[row][col] - The new temperature for any
	 *         element in the border of the array is the same as the old
	 *         temperature. - Otherwise, the new temperature is the average of the
	 *         four adjacent entries. Postcondition: temps is unchanged.
	 */
	private double computeTemp(int row, int col) {
		double temp1 = temps[row][col];

		if (row == 0 || col == 0 || row == temps.length - 1 || col == temps[0].length - 1)
			return temp1;
		else {
			double avg = temps[row][col - 1] + temps[row][col + 1] + temps[row - 1][col] + temps[row + 1][col];
			avg /= 4;
			return avg;
		}
	}

	/**
	 * Updates all values in temps and returns a boolean that indicates whether or
	 * not all the new values were within tolerance of the original values.
	 * 
	 * @param tolerance a double value >= 0
	 * @return true if all updated temperatures are within tolerance of the original
	 *         values; false otherwise. Postcondition: Each value in temps has been
	 *         updated with a new value based on the corresponding call to
	 *         computeTemp.
	 */
	public boolean updateAllTemps(double tolerance) {
		updatedTemps = new double[temps.length][temps[0].length];
		int falsecount = 0;

		for (int i = 0; i < temps.length; i++) {
			for (int j = 0; j < temps[0].length; j++) {
				updatedTemps[i][j] = computeTemp(i, j);
				if (Math.abs(updatedTemps[i][j] - temps[i][j]) > tolerance)
					falsecount++;

			}
		}
		if (falsecount >= 1)
			return false;
		else
			return true;
	}

	public String toString() {
		String output = "";

		for (int i = 0; i < temps.length; i++) {
			for (int j = 0; j < temps[0].length; j++) {
				output += (updatedTemps[i][j] + "\t");
			}
			output += ("\n");
		}

		return output;
	}

// There may be instance variables, constructors, and methods that are not shown.
}
