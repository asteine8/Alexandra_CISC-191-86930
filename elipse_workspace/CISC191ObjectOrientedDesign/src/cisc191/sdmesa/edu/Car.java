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
 * A Car class that extends the Vehicle class. Adds numberOfDoors and functionality to support it.
 */

// [Is-A] Car is a Vehicle
public class Car extends Vehicle {
	
	private int numberOfDoors;

	/**
	 * Constructor for Car without numberOfDoors
	 * 
	 * @param manufacturerName: The name of the manufacturer that made the car
	 * @param miles: How many miles are on car
	 * @param price: How much is the car worth
	 * @param numSeats: How many seats are in the car
	 * @param options: An array of Option objects that store the options for the car
	 */
	public Car(String manufacturerName, int miles, int price, int numSeats, Option[] options) {
		super(manufacturerName, miles, price, numSeats, options); // Call super constructor from Vehicle
		numberOfDoors = -1; // Set number of doors to -1 if not specified
	}
	
	/**
	 * Constructor for Car with numberOfDoors
	 * 
	 * @param manufacturerName: The name of the manufacturer that made the car
	 * @param miles: How many miles are on car car
	 * @param price: How much is the car worth
	 * @param numSeats: How many seats are in the car
	 * @param options: An array of Option objects that store the options for the car
	 * @param numberOfDoors: How many doors does the car have
	 */
	public Car(String manufacturerName, int miles, int price, int numSeats, Option[] options, int numberOfDoors) {
		super(manufacturerName, miles, price, numSeats, options);  // Call super constructor from Vehicle
		this.numberOfDoors = numberOfDoors;
	}
	
	/**
	 * Gets the number of doors on the car
	 * @return the number of doors on the car
	 */
	public int getNumberOfDoors() {
		return numberOfDoors;
	}
}
