package week9.examples;

public interface Transportable {
	public double getPrice(String from, String to);
	default void printInvoice() {
		System.out.println("Transportable.printInvoice");
	}
}
