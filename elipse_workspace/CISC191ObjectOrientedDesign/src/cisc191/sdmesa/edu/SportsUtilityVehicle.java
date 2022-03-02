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
 * A SportsUtilityVehicle class that extends the Vehicle class and adds a field for maxTowingWeight and supporting methods
 */

// [Is-A] SportsUtilityVehicle is a Vehicle
public class SportsUtilityVehicle extends Vehicle {
	
	private int maxTowingWeight;

	/**
	 * Constructor for SportsUtilityVehicle without maxTowingWeight
	 * 
	 * @param manufacturerName: The name of the manufacturer that made the vehicle
	 * @param miles: How many miles are on vehicle
	 * @param price: How much is the vehicle worth
	 * @param numSeats: How many seats are in the vehicle
	 * @param options: An array of Option objects that store the options for the vehicle
	 */
	public SportsUtilityVehicle(String manufacturerName, int miles, int price, int numSeats, Option[] options) {
		super(manufacturerName, miles, price, numSeats, options); // Use super constructor from Vehicle
		this.maxTowingWeight = 0; // Set to 0 by default
	}
	
	/**
	 * Constructor for SportsUtilityVehicle with maxTowingWeight
	 * 
	 * @param manufacturerName: The name of the manufacturer that made the vehicle
	 * @param miles: How many miles are on vehicle
	 * @param price: How much is the vehicle worth
	 * @param numSeats: How many seats are in the vehicle
	 * @param options: An array of Option objects that store the options for the vehicle
	 * @param maxTowingWeight: How much weight the vehicle can tow
	 */
	public SportsUtilityVehicle(String manufacturerName, int miles, int price, int numSeats, Option[] options, int maxTowingWeight) {
		super(manufacturerName, miles, price, numSeats, options); // Use super constructor from Vehicle
		this.maxTowingWeight = maxTowingWeight;
	}
	
	/**
	 * Gets how much weight the vehicle can tow
	 * @return how much weight the vehicle can tow
	 */
	public int getMaxTowingWeight() {
		return maxTowingWeight;
	}

}
