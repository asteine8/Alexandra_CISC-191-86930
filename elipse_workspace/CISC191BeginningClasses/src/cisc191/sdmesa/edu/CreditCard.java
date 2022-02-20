package cisc191.sdmesa.edu;

/**
 * Lead Author(s):
 * @author Shane Hage
 * @author Alexandra Steiner
 * 
 * References:
 * Morelli, R., & Walde, R. (2016). Java, Java, Java: Object-Oriented Problem Solving.
 * Retrieved from https://open.umn.edu/opentextbooks/textbooks/java-java-java-object-oriented-problem-solving
 * 
 * Version/date: 1.2 - 2/20/2022
 * 
 * Responsibilities of class:
 * A credit card class that stores general information about the card and implements a formatted
 * toString method to return the card's information in a human-readable way
 * 
 */
public class CreditCard {
	private String number;
	private String expiration;
	private String securityCode;
	private Person cardHolder;
	
	/**
	 * Constructs a credit card
	 * @param number: the credit card number
	 * @param expiration: the credit card's expiration date
	 * @param securityCode: the security code
	 * @param cardHolder: the card holder
	 */
	public CreditCard(String number, String expiration, String securityCode, Person cardHolder) {
		this.number = number;
		this.expiration = expiration;
		this.securityCode = securityCode;
		this.cardHolder = cardHolder;
	}
	
	/**
	 * Formats the data contained in credit card and returns as a string
	 * @return a formatted string representing the credit card
	 */
	@Override
	public String toString() {
		return String.format("%s %s %s %s", number, expiration, securityCode, cardHolder.getName());
	}
}
