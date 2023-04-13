package week8.examples;

public abstract class Animal {
	public abstract void talk();

	public abstract int getAge();
	
	public Animal() {
		super();
	}
	public Animal(String name) {
		super();
	}

	public void sleep() {
		System.out.println("Zzzzzz");
	}

}
