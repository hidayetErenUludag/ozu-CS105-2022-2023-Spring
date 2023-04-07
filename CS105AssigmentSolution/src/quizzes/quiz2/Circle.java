package quizzes.quiz2;

public class Circle {
	private double radius=1;
	private static double pi=3.14;

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	public Circle() {
		super();
	}

	
	public void printCircleInfo() {
		double a=radius*radius*Circle.pi;
		double c=2*Circle.pi*radius;
		System.out.println("r="+radius+" Area:"+a+" Circumference:"+c);
	}
}
