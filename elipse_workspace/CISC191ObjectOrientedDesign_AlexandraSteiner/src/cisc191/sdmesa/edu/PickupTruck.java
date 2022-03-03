package cisc191.sdmesa.edu;

/**
 * Lead Author(s):
 * @author Alexandra Steiner
 * 
 * Other contributors:
 * 
 * References:
 * Morelli, R., & Walde, R. (2016). Java, Java, Java: Object-Oriented Problem Solving.
 * Retrieved from https://open.umn.edu/opentextbooks/textbooks/java-java-java-object-oriented-problem-solving
 * 
 * Version/date: 1.0 - 3/1/22
 * 
 * Responsibilities of class:
 * A PickupTruck class that extends the Vehicle class and adds a field for cargoCapacity and supporting methods
 */

// [Is-A] PickupTruck is a Vehicle
public class PickupTruck extends Vehicle {

	private int cargoCapacity;
	
	/**
	 * Constructor for PickupTruck without cargoCapacity
	 * 
	 * @param manufacturerName: The name of the manufacturer that made the vehicle
	 * @param miles: How many miles are on vehicle
	 * @param price: How much is the vehicle worth
	 * @param numSeats: How many seats are in the vehicle
	 * @param options: An array of Option objects that store the options for the vehicle
	 */
	public PickupTruck(String manufacturerName, int miles, int price, int numSeats, Option[] options) {
		super(manufacturerName, miles, price, numSeats, options); // Use super constructor from Vehicle
		cargoCapacity = 0; // Set to 0 by default
	}
	
	/**
	 * Constructor for PickupTruck with cargoCapacity
	 * 
	 * @param manufacturerName: The name of the manufacturer that made the vehicle
	 * @param miles: How many miles are on vehicle
	 * @param price: How much is the vehicle worth
	 * @param numSeats: How many seats are in the vehicle
	 * @param options: An array of Option objects that store the options for the vehicle
	 * @param cargoCapacity: How much cargo the pickup truck can hold
	 */
	public PickupTruck(String manufacturerName, int miles, int price, int numSeats, Option[] options, int cargoCapacity) {
		super(manufacturerName, miles, price, numSeats, options); // Use super constructor from Vehicle
		this.cargoCapacity = cargoCapacity;
	}
	
	/**
	 * Gets how much cargo the truck can hold
	 * @return how much cargo the truck can hold
	 */
	public int getCargoCapacity() {
		return cargoCapacity;
	}

}
