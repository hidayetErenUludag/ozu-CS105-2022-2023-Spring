package week7.exercise.q1;


/*
 * Inheritance:
 * X extends Y: this means X is subclass of Y.
 * super : --> Uses the constructor of the Y class.
 */

public class Cat extends Animal{

	public Cat(boolean veg, String food, int legs, String color)
	{
		super(veg, food, legs);
		this.setColor(color);
	}
	
}