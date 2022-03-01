package cisc191.sdmesa.edu;

public class Car extends Vehicle {
	
	private int numberOfDoors;

	public Car(String manufacturerName, int miles, int price, int numSeats, Option[] options) {
		super(manufacturerName, miles, price, numSeats, options);
		numberOfDoors = -1;
	}
	
	public Car(String manufacturerName, int miles, int price, int numSeats, Option[] options, int numberOfDoors) {
		super(manufacturerName, miles, price, numSeats, options);
		this.numberOfDoors = numberOfDoors;
	}
	
	public int getNumberOfDoors() {
		return numberOfDoors;
	}

}
