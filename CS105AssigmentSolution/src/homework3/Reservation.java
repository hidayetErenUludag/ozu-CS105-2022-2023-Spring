package homework3;

public class Reservation {
	private String reservationNumber;
	private Person person;
	private Vehicle rentedVehicle;
	private int dayCount;

	public Reservation(Person person, Vehicle vehicle, int dayCount, int resNumber) {
		this.dayCount=dayCount;
		this.person=person;
		this.rentedVehicle=vehicle;
		this.reservationNumber=String.valueOf(resNumber);
	}

	public String getReservationNumber() {
		return reservationNumber;
	}

	public void setReservationNumber(String reservationNumber) {
		this.reservationNumber = reservationNumber;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	

	public int getDayCount() {
		return dayCount;
	}

	public void setDayCount(int dayCount) {
		this.dayCount = dayCount;
	}

	public Vehicle getRentedVehicle() {
		return rentedVehicle;
	}

	public void setRentedVehicle(Vehicle rentedVehicle) {
		this.rentedVehicle = rentedVehicle;
	}

	@Override
	public String toString() {
		return "Res [" + reservationNumber + ", "+dayCount+" days], Driver:"+person+
				", Vehicle ["+rentedVehicle+"]"
				;
	}

	

	

	

}
