package week3.examples;

public class SimpleNestedLoopExamples {

	public static void main(String[] args) {
		for (int i = 1; i <= 3; i++) {
			System.out.print("Line:" + i + " ");
			for (int j = 1; j <= 5; j++) {
				System.out.print("*");
			}
			System.out.println(); // to end the line
		}
		System.out.println("New Nested Loop"); // to end the line
		for (int i = 1; i <= 3; i++) {
			System.out.print("Line:" + i + " ");
			for (int j = 1; j <= i; j++) {
				System.out.print("$");
			}
			System.out.println(); // to end the line
		}
		
		System.out.println("Last Nested Loop"); 
		for (int i = 5; i >= 1; i--) {  
		    for (int j = 1; j <= i; j++) {
		        System.out.print(i);
		    }
		    System.out.println();
		}
		/* change the code for printing following result
		 54321 => i = 5  j=5...1
		 4321 =>i =4 j=4..1
		 321
		 21
		 1 =>i =1 j=1..1
		 */
		System.out.println("Last Nested Loop"); 
		for (int i = 5; i >= 1; i--) {  
		    for (int j = i; j >= 1; j--) {
		        System.out.print(j);
		    }
		    System.out.println();
		}
		
		/* 
		 ....1 
		 ...2 
		 ..3
		 .4
		 5
		 */
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5-i;j++) {
				System.out.print(".");
			}
			System.out.println(i);
		}
		
		/*
		 * ....1 line=1  j=1..4(5-line) k=1..0 1..(
		 * ...2. line=2  j=1..3(5-line) k=1..1
		 * ..3.. line=3  j=1..2			k=1..2 (line-1)
		 * .4... line=4  j=1..1			k=1..3 (line-1)
		 * 5.... line=5  j=1..0(5-line) k=1..4
		 */
		for (int line = 1; line <= 5; line++) {
		    for (int j = 1; j <= (5-line); j++) {
		        System.out.print(".");
		    }
		    System.out.print(line);
		    for (int k = 1; k <= line-1; k++) {
		        System.out.print(".");
		    }
		    System.out.println();
		}



	}

}
