package cisc191.sdmesa.edu;

/**
 * Lead Author(s):
 * @author 
 * @author 
 * <<add additional lead authors here, with a full first and last name>>
 * 
 * Other contributors:
 * <<add additional contributors (mentors, tutors, friends) here, with contact information>>
 * 
 * References:
 * Morelli, R., & Walde, R. (2016). Java, Java, Java: Object-Oriented Problem Solving.
 * Retrieved from https://open.umn.edu/opentextbooks/textbooks/java-java-java-object-oriented-problem-solving
 * 
 * <<add more references here>>
 *  
 * Version/date: 
 * 
 * Responsibilities of class:
 * 
 */

// TODO: Implement and comment all IS-A and IS relationships separately

public class Vehicle {
	
	private String manufacturerName;
	private int miles;
	private int price;
	private int numSeats;
	private Option options[];
	
	/**
	 * 
	 * 
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
	
	
	public String getManufacturerName() {
		return manufacturerName;
	}
	
	public int getMilesOnVehicle() {
		return miles;
	}
	
	public int getPrice() {
		return price;
	}
	
	public int getNumberOfSeats() {
		return numSeats;
	}
	
	public Option[] getOptions() {
		return options.clone();
	}
}
