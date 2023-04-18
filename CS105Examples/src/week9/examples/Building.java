package week9.examples;

public class Building implements Insurable {
	@Override
	public double getPremium() {
		System.out.println("Building.getPremium");
		return 200;
	}
}
