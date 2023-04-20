package homework3;

public class CarPark {
	private String name;
	private int capacity;
	private Vehicle[] vehicles;
	private Reservation[] reservations;
	int lastVehicleIndex = -1;
	int lastReservationIndex = -1;

	public boolean addVehicle(Vehicle vehicle) {
		if (lastVehicleIndex < vehicles.length - 1) {
			lastVehicleIndex++;
			vehicles[lastVehicleIndex] = vehicle;
			return true;
		}
		return false;
	}

	public void makeReservation(Vehicle vehicle, Person person, int dayCount) {
		int resNumber = (int) (Math.random() * 9000 + 1000);
		Reservation reservation = new Reservation(person, vehicle, dayCount, resNumber);
		if (lastReservationIndex < reservations.length - 1) {
			lastReservationIndex++;
			reservations[lastReservationIndex] = reservation;
		}
	}

	public double computeTotalAmount() {
		double total = 0;
		for (int i = 0; i <= lastReservationIndex; i++) {
			Reservation res = reservations[i];
			total += res.getDayCount() * res.getRentedVehicle().getDailyPrice();

		}

		return total;
	}

	public void printRentedVehicles() {
		for (int i = 0; i <= lastReservationIndex; i++) {
			System.out.println(reservations[i]);
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public CarPark(String name, int capacity) {
		super();
		this.name = name;
		this.capacity = capacity;
		this.vehicles = new Vehicle[capacity];
		this.reservations = new Reservation[capacity];
	}

	public Vehicle[] getVehicles() {
		return vehicles;
	}

	public void setVehicles(Vehicle[] vehicles) {
		this.vehicles = vehicles;
	}

	public Reservation[] getReservations() {
		return reservations;
	}

	public void setReservations(Reservation[] reservations) {
		this.reservations = reservations;
	}

}
