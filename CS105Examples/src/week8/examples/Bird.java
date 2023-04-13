package week8.examples;

public class Bird extends Animal{

	@Override
	public void talk() {
		System.out.println("cik cik");
	}

	@Override
	public int getAge() {
		
		return 1;
	}

	@Override
	public void sleep() {
		System.out.println("Standup--- zzzz");
	}

}
