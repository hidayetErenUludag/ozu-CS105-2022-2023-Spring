package week9.examples;

public class Person implements Insurable,Transportable {

	@Override
	public double getPremium() {
		System.out.println("Person.getPremium");
		return 100;
	}

	@Override
	public double getPrice(String from, String to) {
		System.out.println("Person.getPrice");
		return 200;
	}

	@Override
	public void printInvoice() {
		System.out.println("Person.printInvoice");
	}

	

}
