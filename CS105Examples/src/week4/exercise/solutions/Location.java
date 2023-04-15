package week4.exercise.solutions;
/**
 * (The Location class) Design a class named Location for locating a 
 * maximal value and its location in a two-dimensional array. 
 * The class contains public data fields row, column, and maxValue 
 * that store the maximal value and its indices in a two-dimensional array 
 * with row and column as int types and maxValue as a double type.
 * Write the following method that returns the location of the largest 
 * element in a two-dimensional array:

public static Location locateLargest(double[][] a) 

The return value is an instance of Location. Write a test program that prompts the user to enter a two-dimensional array and displays the location of the largest element in the array. Here is a sample run:

Enter the number of rows and columns in the array: 3 4
Enter the array:
23.5 35 2 10
4.5 3 45 3.5
35 44 5.5 9.6
The location of the largest element is 45 at (1, 2)

 * @author Esma Meral
 *
 */
public class Location {
	private int row;
	private int column;
	private double maxValue;
	
public static Location locateLargest(double[][] a) {
	Location l=new Location();
	l.maxValue=a[0][0];
	for (int i = 0; i < a.length; i++) {
		for (int j = 0; j < a[0].length; j++) {
			if(a[i][j]>l.maxValue) {
				l.maxValue=a[i][j];
				l.row=i;
				l.column=j;
			}
		}
	}
	return l;
}

public int getRow() {
	return row;
}

private void setRow(int row) {
	this.row = row;
}

public int getColumn() {
	return column;
}

private void setColumn(int column) {
	this.column = column;
}

public double getMaxValue() {
	return maxValue;
}

private void setMaxValue(double maxValue) {
	this.maxValue = maxValue;
}
}
