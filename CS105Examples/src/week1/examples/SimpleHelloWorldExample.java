package week1.examples;

public class SimpleHelloWorldExample {

	public static void main(String[] args) {
		System.out.println("Hello World");
		int firstValue=19;
		int secondValue=45;
		
		int sum=firstValue+secondValue;
		System.out.println(sum);
		
		
		for (int i = 0; i < 6; i++) {
			  if (i == 4) {
			     continue;
			  }
			  System.out.println(i);
			}


	}

}
