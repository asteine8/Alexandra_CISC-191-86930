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
 * A Vehicle class that record the manufacturer, miles, price, number of seats, and options for the vehicle. Has QOL
 * getter methods.
 */

public class Vehicle {
	
	private String manufacturerName;
	private int miles;
	private int price;
	private int numSeats;
	private Option options[]; // [Has-A] Vehicle has an array of Option
	
	/**
	 * Constructor for the Vehicle Class
	 * 
	 * @param manufacturerName: The name of the manufacturer that made the vehicle
	 * @param miles: How many miles are on vehicle
	 * @param price: How much is the vehicle worth
	 * @param numSeats: How many seats are in the vehicle
	 * @param options: An array of Option objects that store the options for the vehicle
	 */
	public Vehicle(String manufacturerName, int miles, int price, int numSeats, Option[] options) {
		this.manufacturerName = manufacturerName;
		this.miles = miles;
		this.price = price;
		this.numSeats = numSeats;
		
		// Only copy by reference if options is null (so clone doesn't throw an error)
		if (options == null) {
			this.options = options;
		}
		else {
			// Make a deep copy of the provided array
			this.options = options.clone();
		}
		
	}
	
	/**
	 * Gets the name of the manufacturer that made the vehicle
	 * @return the name of the manufacturer
	 */
	public String getManufacturerName() {
		return manufacturerName;
	}
	
	/**
	 * Gets the number of miles on the vehicle
	 * @return the number of miles on the vehicle
	 */
	public int getMilesOnVehicle() {
		return miles;
	}
	
	/**
	 * Gets the price of the vehicle
	 * @return the price of the vehicle
	 */
	public int getPrice() {
		return price;
	}
	
	/**
	 * Gets the number of seats in the vehicle
	 * @return the number of seats in the vehicle
	 */
	public int getNumberOfSeats() {
		return numSeats;
	}
	
	/**
	 * Gets the options that come with the vehicle
	 * @return a list of options that come with the vehicle
	 */
	public Option[] getOptions() {
		return options.clone();
	}
}
