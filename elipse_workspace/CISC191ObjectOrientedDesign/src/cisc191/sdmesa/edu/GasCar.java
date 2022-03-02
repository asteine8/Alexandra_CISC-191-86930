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
 * A GasCar that extends Car and implements Combustible. Adds a fuelLevel field
 */

//[Is-A] GasCar is a Car
//[Implements] GasCar is Combustible
public class GasCar extends Car implements Combustible {
	
	private int fuelLevel = 0;

	/**
	 * Constructor for GasCar without numberOfDoors
	 * 
	 * @param manufacturerName: The name of the manufacturer that made the car
	 * @param miles: How many miles are on car
	 * @param price: How much is the car worth
	 * @param numSeats: How many seats are in the car
	 * @param options: An array of Option objects that store the options for the car
	 */
	public GasCar(String manufacturerName, int miles, int price, int numSeats, Option[] options) {
		super(manufacturerName, miles, price, numSeats, options); // Call super constructor from Car
	}
	
	/**
	 * Constructor for GasCar with numberOfDoors
	 * 
	 * @param manufacturerName: The name of the manufacturer that made the car
	 * @param miles: How many miles are on car car
	 * @param price: How much is the car worth
	 * @param numSeats: How many seats are in the car
	 * @param options: An array of Option objects that store the options for the car
	 * @param numberOfDoors: How many doors does the car have
	 */
	public GasCar(String manufacturerName, int miles, int price, int numSeats, Option[] options, int numberOfDoors) {
		super(manufacturerName, miles, price, numSeats, options, numberOfDoors); // Call super constructor from Car
	}

	/**
	 * Gets how much fuel is left in the tank
	 * @return how much fuel is left in the tank
	 */
	public int getFuelLevel() {
		return fuelLevel;
	}
	
	/**
	 * Increases the fuel in the tank by 100
	 */
	public void tankUp() {
		fuelLevel += 100;
	}

}
