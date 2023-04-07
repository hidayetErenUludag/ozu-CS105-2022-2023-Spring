package homework1;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of rows in array: ");
		int rows = input.nextInt();
		System.out.println("Enter the number of columns in array: ");
		int columns = input.nextInt();
		System.out.println("Array has " + rows + " rows and " + columns + " columns.");
		int[][] array = new int[rows][columns];
		
		//getting input for original array.
		for(int i=0; i < rows; i++) 
		{
			for(int j=0; j < columns; j++) 
			{
				System.out.println("Enter row " + (i+1) + " element " + (j+1));
				array[i][j] = input.nextInt();
			}
		}
		
		//Printing original array.
		System.out.println("Your original array is ");
		for (int i = 0; i < array.length; i++) 
		{
		    for (int j = 0; j < array[i].length; j++) {
		    	System.out.print(array[i][j] + " ");
		    }
		    System.out.println();
		}
		
		System.out.println("Your new array is ");

		//Finding the amount of row that includes zeros to create a new array.
		int zerosAmount=0;
		for (int i = 0; i < array.length; i++) 
		{
		    for (int j = 0; j < array[i].length; j++) {
		    	if(array[i][j]==0) 
		    	{
		    		zerosAmount++;
		    		break;
		    	}
		    }
		}
		
		//Creating and printing new array.
		int[][] newArray= new int[rows - zerosAmount][columns];
		int k = -1;
		for (int i = 0; i < array.length; i++) 
		{
			boolean thereIsZero = false;
		    for (int j = 0; j < array[i].length; j++) {
		    	if(array[i][j]==0) 
		    	{
		    		thereIsZero = true;
		    		break;
		    	}
		    	else 
		    		continue;
		    }
		    if(thereIsZero == false) 
		    {
		    	k++;
		    	for (int j = 0; j < array[i].length; j++) 
		    	{
			    	System.out.print(array[i][j] + " ");
			    	newArray[k][j] = array[i][j]; 
		    	}
		    System.out.println();
		    }   
		}
	}
}
