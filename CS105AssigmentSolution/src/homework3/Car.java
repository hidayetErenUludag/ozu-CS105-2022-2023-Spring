package homework3;

public class Car extends Vehicle {
	private int seatCount;
	

	public Car(String licensePlateNumber, String category, String transmission, String brand, String model, String year,
			int dailyPrice, int seatCount) {
		super(licensePlateNumber, category, transmission, brand, model, year, dailyPrice);
	
		this.seatCount=seatCount;
	
	}

	public int getSeatCount() {
		return seatCount;
	}

	public void setSeatCount(int seatCount) {
		this.seatCount = seatCount;
	}

	@Override
	public String toString() {
		return super.toString() +","+seatCount+" seats "+getClass().getSimpleName();
	}

	

	


}
