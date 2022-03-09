package cisc191.sdmesa.edu;

/**
 * Lead Author(s):
 * @author Alexandra Steiner
 * 
 * References:
 * Morelli, R., & Walde, R. (2016). Java, Java, Java: Object-Oriented Problem Solving.
 * Retrieved from https://open.umn.edu/opentextbooks/textbooks/java-java-java-object-oriented-problem-solving
 *  
 * Version/date: 1.0 - 3/8/22
 * 
 * Responsibilities of class:
 * An exception for invalid amount. Adds a custom constructor to make nice exception messages
 */

public class InvalidAmountException extends RuntimeException {

	/**
	 * Default constructor so we have it
	 */
	public InvalidAmountException() {
		super();
	}

	/**
	 * Creates an InvalidAmountException with a message
	 * @param message
	 */
	public InvalidAmountException(String message) {
		super(message);
	}
	
	/**
	 * Creates an InvalidAmountException with a message based on the specified amount
	 * @param amount
	 */
	public InvalidAmountException(double amount) {
		super(String.format("Amount %f is invalid", amount));
	}
}
