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
 * A credit card charge class that stores general information about the charge and implements a formatted
 * toString method to return the charge's information in a human-readable way
 * 
 */
public class CreditCardCharge {
	private int year;
	private int month;
	private int day;
	private Boat purchasedBoat;
	private String companyName;
	private CreditCard chargedCard;
	
	/**
	 * Constructs a new credit card charge
	 * @param y: the year the charge was made
	 * @param m: the month the charge was made
	 * @param d: the day the charge was made
	 * @param boat: the boat that was purchased
	 * @param company: the company that purchased the boat
	 * @param card: the card used to pay for the boat
	 */
	public CreditCardCharge(int y, int m, int d, Boat boat, String company, CreditCard card) {
		year = y;
		month = m;
		day = d;
		
		purchasedBoat = boat;
		companyName = company;
		chargedCard = card;
	}
	
	/**
	 * Returns the credit card charge as a formatted string
	 * @return the formatted string
	 */
	@Override
	public String toString() {
		return String.format("%d/%d/%d %s %s %s $%s", year, month, day, chargedCard.toString(), companyName, 
												  purchasedBoat.getMake(), purchasedBoat.getPrice());
	}
}
