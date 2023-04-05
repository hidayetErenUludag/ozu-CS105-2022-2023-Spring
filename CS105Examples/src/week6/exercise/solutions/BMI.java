package week6.exercise.solutions;


public class BMI {
	
	private String name;
	public int age;
	public double weight, height;
	public double bmiScore;
	
	public BMI(String name, int age, double weight, double height)
	{
		// Save the variables to the class variables.
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.height = height;
		this.bmiScore = calculateBMI(weight, height);
	}
	public BMI(String name, double weight, double height)
	{
		// Save the variables to the class variables.
		this.name = name;
		this.weight = weight;
		this.height = height;
		this.age = 20; // Default value of age.
		
		this.bmiScore = calculateBMI(weight, height);

	}
	
	private double calculateBMI(double weight, double height)
	{	
		double heightMt = height * 0.0254;
		double weightKg = weight * 0.453592;
		
		double bmi = weightKg / (heightMt * heightMt);
		
		return bmi;
	}
	
	public double getBMI()
	{
		// Calculate numeric BMI or return it immediately.
		return this.bmiScore;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public String getStatus()
	{
		// Return interpretation of the BMI in terms of underweight
		// normal, overweight, obese.
		double bmi = this.bmiScore;
		
		if (bmi < 18.5)
			return "Underweight";
		else if (bmi < 25.0)
			return "Normal";
		else if (bmi < 30)
			return "Overweight";
		else
			return "Obese";
	}
}
