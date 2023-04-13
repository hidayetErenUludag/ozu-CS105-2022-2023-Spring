package week7.exercise.q1;


public class Animal {
	
	private String color, eats;
	private int noOfLegs;
	private boolean vegetarian;
	
	public Animal()
	{
		
	}
	
	public Animal(boolean vegetarian, String food, int legs)
	{
		this.vegetarian = vegetarian;
		this.eats = food;
		this.noOfLegs = legs;
	}
	
	public boolean isVegetarian() {
		return vegetarian;
	}
	public void setVegeterian(boolean vegetarian) {
		this.vegetarian = vegetarian;
	}
	public int getNoOfLegs() {
		return noOfLegs;
	}
	public void setNoOfLegs(int noOfLegs) {
		this.noOfLegs = noOfLegs;
	}
	public String getEats() {
		return eats;
	}
	public void setEats(String eats) {
		this.eats = eats;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
}
