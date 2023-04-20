package homework3;

public class Motorcycle extends Vehicle {
	private String type;

	public Motorcycle(String licensePlateNumber, String category, String transmission, String brand, String model,
			String year, int dailyPrice, String type) {
		super(licensePlateNumber, category, transmission, brand, model, year, dailyPrice);
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return super.toString() +","+type;

	}

}
