package week4.exercise.solutions;
/**
 * Define a class named Circle. What do your Circles objects 
 * have(data)? What do your Circle objects do? (behavior). 
 * Don’t forget to create a constructor method. 
 * Use your Circle class in another class and test your methods.
 * Generate 5 random numbers less than 20 and create your 
 * circle objects which using generated numbers a radius. 
 * Add toString method in the Circle class.
 * toString method should print object as shown below:
 * The area and perimeter of the circle of radius 1.0 is 3.141592653589793 and 6.283185307179586
 * @author Esma Meral
 *
 */
public class Question5_Test {
public static void main(String[] args) {
	for (int i = 1; i < 5; i++) {
		double r=Math.random()*19+1;
		Circle c=new Circle(r);
		System.out.println(c);
	}
}
}
