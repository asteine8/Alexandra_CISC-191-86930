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
 * Version/date: 1.1 - 2/17/2022
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
	 * @param num: the credit card number
	 * @param exp: the credit card's expiration date
	 * @param cvv: the security code
	 * @param p: the card holder
	 */
	public CreditCard(String num, String exp, String cvv, Person p) {
		number = num;
		expiration = exp;
		securityCode = cvv;
		cardHolder = p;
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
