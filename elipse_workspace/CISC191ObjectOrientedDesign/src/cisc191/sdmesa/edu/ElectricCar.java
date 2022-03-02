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
 * An ElectricCar that extends the Car class. Implements the Chargeable interface and adds a field for batteryCharge
 */

//[Is-A] ElectricCar is a Car
//[Implements] ElectricCar is Chargeable
public class ElectricCar extends Car implements Chargeable {
	
	private int batteryCharge = 0;

	/**
	 * Constructor for ElectricCar without numberOfDoors
	 * 
	 * @param manufacturerName: The name of the manufacturer that made the car
	 * @param miles: How many miles are on car
	 * @param price: How much is the car worth
	 * @param numSeats: How many seats are in the car
	 * @param options: An array of Option objects that store the options for the car
	 */
	public ElectricCar(String manufacturerName, int miles, int price, int numSeats, Option[] options) {
		super(manufacturerName, miles, price, numSeats, options);
	}
	
	/**
	 * Constructor for ElectricCar with numberOfDoors
	 * 
	 * @param manufacturerName: The name of the manufacturer that made the car
	 * @param miles: How many miles are on car car
	 * @param price: How much is the car worth
	 * @param numSeats: How many seats are in the car
	 * @param options: An array of Option objects that store the options for the car
	 * @param numberOfDoors: How many doors does the car have
	 */
	public ElectricCar(String manufacturerName, int miles, int price, int numSeats, Option[] options,
			int numberOfDoors) {
		super(manufacturerName, miles, price, numSeats, options, numberOfDoors);
	}

	/**
	 * Gets how much charge is left in the battery
	 * @return how much charge is left in the battery
	 */
	public int getBatteryCharge() {
		return batteryCharge;
	}

	/**
	 * Increases the charge in the battery by 100
	 */
	public void chargeUp() {
		batteryCharge += 100;
	}
}
