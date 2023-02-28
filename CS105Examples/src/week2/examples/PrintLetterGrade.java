package week2.examples;

import java.util.Scanner;

/**
 * Let's write a program that reads the student's 
 * grade from the keyboard and prints student’s letter grade on the screen. 
 * You can use following catalog grading method: 
 * Grade	Score
 * A	85-100
 * B	70-85
 * C	55-70
 * D	40-55
 * F	0-39
 *
 */
public class PrintLetterGrade {

	public static void main(String[] args) {
		Scanner out = new Scanner(System.in);
		 
		System.out.println("Please enter your grade");
		int grade=out.nextInt();
		
		String letterGrade;
		if(grade>=85)	
			letterGrade="A";
		else if(grade>=70)
			letterGrade="B";
		else if(grade>=55)
			letterGrade="C";
		else if(grade>=40)
			letterGrade="D";
		else
			letterGrade="F";
		
		System.out.println("Your letter grade:"+letterGrade);
		
		if(grade<40)	
			letterGrade="F";
		else if(grade<=55)
			letterGrade="D";
		else if(grade<=70)
			letterGrade="C";
		else if(grade<=85)
			letterGrade="B";
		else
			letterGrade="A";
		System.out.println("Your letter grade:"+letterGrade);
	}

}
