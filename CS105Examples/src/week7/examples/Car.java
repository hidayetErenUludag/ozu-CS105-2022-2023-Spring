package week7.examples;

public class Car extends Vehicle {

	public Car() {
		super();
	}
	@Override
	public String getColor() {
		return "Blue ";
	}

	public String toString() {
		return getColor() + " Car";
	}
	
	
}
