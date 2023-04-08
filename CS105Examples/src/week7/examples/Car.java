package week7.examples;

public class Car extends Vehicle {

	public Car() {
		this(1300);
		System.out.println("B1");
	}
	public Car(int power) {
		System.out.println("B2");
	}
	
	@Override
	public String getColor() {
		return "Blue ";
	}

	public String toString() {
		return super.getColor() + " Car";
	}
	
	
}
