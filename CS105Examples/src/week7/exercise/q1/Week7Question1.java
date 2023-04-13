package week7.exercise.q1;


public class Week7Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat cat = new Cat(false, "milk", 4, "black");
		System.out.println("Cat is Vegetarian?" + cat.isVegetarian());
		System.out.println("Cat eats " + cat.getEats());
		System.out.println("Cat has " + cat.getNoOfLegs() + " legs.");
		System.out.println("Cat color is " + cat.getColor());
	}

}
