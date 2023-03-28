package week5.examples;

public class Customer {
	private int id = 100;
	private String name="Ahmet";
	
	private static  double rate=2.5;
	
	public int getId() {
		return id;
	}
	private void setId(int id) {
		
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static double getRate() {
		return rate;
	}
	public static void setRate(double rate) {
		Customer.rate = rate;
	}
	
	
	
	
	

}
