package week3.examples;

public class MathClassExamples {

	public static void main(String[] args) {
		//Generate integers between [10,99]
		System.out.println(10+(int)(Math.random()*90));

		//Generate integers between [0,9]
		System.out.println((int)(Math.random()*10));
		
		//Wrong usage. Always returns 0. 
		System.out.println((int)Math.random()*10);

	}

}
