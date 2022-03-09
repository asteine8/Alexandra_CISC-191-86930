package cisc191.sdmesa.edu;

/**
 * Lead Author(s):
 * @author Alexandra Steiner
 * 
 * References:
 * Morelli, R., & Walde, R. (2016). Java, Java, Java: Object-Oriented Problem Solving.
 * Retrieved from https://open.umn.edu/opentextbooks/textbooks/java-java-java-object-oriented-problem-solving
 *  
 * mkyong (July, 2020). How to format a double in Java. Mkyong. Retrieved from: 
 * https://mkyong.com/java/how-to-format-a-double-in-java/
 * 
 * Version/date: 1.0 - 3/8/22
 * 
 * Responsibilities of class:
 * An exception for when one attempts to withdraw more than they have in an account. Adds a custom constructor to
 * make nice exception messages
 */

public class InsufficientFundsException extends RuntimeException {

	/**
	 * Default constructor so we have it
	 */
	public InsufficientFundsException() {
	}

	/**
	 * Creates an InsufficientFundsException with a message
	 * @param message
	 */
	public InsufficientFundsException(String message) {
		super(message);
	}
	
	/**
	 * Creates an InsufficientFundsException with a message formatted using the specified amount and balance
	 * @param balance
	 * @param amount
	 */
	public InsufficientFundsException(double balance, double amount) {
		super(String.format("Withdrawing amount: %.1f that is larger than balance: %.1f is not allowed", amount, balance));
	}
	
}
