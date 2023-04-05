package week6.exercise.solutions;


public class Week6Question2 {

	public static void main(String[] args)
	{
		BMI bmiKim = new BMI("Kim Yang", 18, 145, 70);
		BMI bmiSus = new BMI("Susan King", 215, 70);

		System.out.println("BMI of " + bmiKim.getName() + " is " + bmiKim.getBMI());
		System.out.println("BMI of " + bmiSus.getName() + " is " + bmiSus.getBMI());
		
		System.out.println("Status of Kim Yang is "+ bmiKim.getStatus());
		System.out.println("Status of Susan King is "+ bmiSus.getStatus());
		
	}
}
