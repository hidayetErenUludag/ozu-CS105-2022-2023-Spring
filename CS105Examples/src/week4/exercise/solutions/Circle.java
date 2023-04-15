package week4.exercise.solutions;

public class Circle {
	private double radius;

	public Circle(double r) {
		this.radius=r;
	}

	public double area() {
		return Math.PI * radius * radius;
	}

	public double perimeter() {
		return 2 * Math.PI * radius;
	}

	@Override
	public String toString() {
		return "The area and perimeter of the circle of radius "+ radius+" is "+area()+" and "+perimeter();	
	}

}
