package week2.examples;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class SimpleForLoopExamples {
	public static void main(String[] args) {
		//Question 1: Write a java program that prints your name 10 
		//times on the screen
		for(int counter=1;counter<=10;counter++) {
			System.out.println("Alp Doyduk");
		}
		for(int counter=10;counter<=100;counter=counter+10) {
			System.out.println("Melike Karakaya");
		}
		int i=1;
		while(i<=10) {
			System.out.println("Eren Uludağ");
			i++;
		}
	//Question 2:
	//Write a program that reads two integers ( n and m)  from the keyboard. 
	//Your program must find the sum of all integers in the range [n, m]
		//30 firstNumber
		//50 firstNumber
		//sum:30+31+...+50
		Scanner input = new Scanner(System.in);
	System.out.println("Enter first number:");
	int firstNum=input.nextInt();
	System.out.println("Enter second number:");
	int secondNum=input.nextInt();
	
	int sum=0;
	int beginValue;
	int endValue;
	if(firstNum>secondNum) {
		beginValue=secondNum;
		endValue=firstNum;
	}else {
		beginValue=firstNum;
		endValue=secondNum;
	}
	
	for(int j=beginValue;j<=endValue;j++) {
		sum=sum+j;	
	}
	System.out.println("Sum:"+sum);		
	}

}
