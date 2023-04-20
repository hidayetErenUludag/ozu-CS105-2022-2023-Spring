package homework3.test;

import homework3.Car;
import homework3.CarPark;
import homework3.Motorcycle;
import homework3.Person;

public class TestCarPark {

	public static void main(String[] args) {
		CarPark carPark = new CarPark("Star Park", 5);
		Car car1 = new Car("34 EYY 62", "Medium", "Automatic", "Honda", "Civic", "2020", 1200,5);
		Car car2 = new Car("34 H 6287", "Small", "Manuel", "Honda", "Jazz", "2019",1000, 5);
		Car car3 = new Car("06 AB 87", "Medium", "Automatic", "Toyota", "Corolla", "2021",1300, 5);
		Car car4 = new Car("16 CK 28", "Large", "Automatic", "Peugeot", "301", "2022",1400, 5);
		Motorcycle motor1 = new Motorcycle("34 KK 71", "Standard", "Manual", "Honda", "CBF 150", "2018", 1500,"Scooter");
		Motorcycle motor2 = new Motorcycle("34 ABC 51", "Adventure", "Manual", "BMW", "R120GS ADV", "2022",
				2000,"Motorcycle");
		System.out.println("park status:"+carPark.addVehicle(car1));
		System.out.println("park status:"+carPark.addVehicle(car2));
		System.out.println("park status:"+carPark.addVehicle(car3));
		System.out.println("park status:"+carPark.addVehicle(motor1));
		System.out.println("park status:"+carPark.addVehicle(motor2));
		System.out.println("park status:"+carPark.addVehicle(car4));
		
		Person person1=new Person("Esma Meral","123456");
		Person person2=new Person("Sema Demir","938767");
		Person person3=new Person("Ahmet Karaca","983011");
		
		carPark.makeReservation(car1, person1, 5);
		carPark.makeReservation(car2, person2, 10);
		carPark.makeReservation(motor1, person3, 4);
		
		System.out.println("Total Amount="+carPark.computeTotalAmount());
		System.out.println("--------- RENTED VEHICLES ---------");
		carPark.printRentedVehicles();

	}

}
