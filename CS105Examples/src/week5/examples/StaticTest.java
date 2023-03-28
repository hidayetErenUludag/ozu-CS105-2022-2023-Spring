package week5.examples;

public class StaticTest {

	public static void main(String[] args) {
		Customer c1=new Customer();
		c1.setName("ece");
		System.out.println(Customer.getRate());
		System.out.println(c1.getRate());
		
		Customer c2=new Customer();
		c2.setName("ali");
		System.out.println(c1.getRate());
		System.out.println(c2.getRate());
		Customer.setRate(3.7);
		c1.setRate(3.7);
		c1.setName("eda");
		System.out.println(c1.getRate()+c1.getName());
		System.out.println(c2.getRate()+c2.getName());
		

	}

}
