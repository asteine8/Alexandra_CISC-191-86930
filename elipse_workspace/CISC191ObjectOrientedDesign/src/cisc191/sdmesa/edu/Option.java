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
 * A class that represents an option that a vehicle may or may not have. Contains the details about the option
 */
public class Option {
	private String details;
	
	/**
	 * Option constructor that accepts a String describing the option's details
	 * @param details
	 */
	public Option(String details) {
		this.details = details;
	}
	
	/**
	 * Gets the details about the option
	 * @return the details about the option
	 */
	public String getDetails() {
		return details;
	}
}
