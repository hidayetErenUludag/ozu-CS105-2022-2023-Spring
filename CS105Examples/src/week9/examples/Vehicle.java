package week9.examples;

public class Vehicle implements Insurable, Transportable {
	@Override
	public double getPremium() {
		System.out.println("Vehicle.getPremium");
		return 80;
	}

	@Override
	public double getPrice(String from, String to) {
		System.out.println("Vehicle.getPrice");
		return 200;
	}
}
