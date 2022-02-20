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
	 * @param year: the year the charge was made
	 * @param month: the month the charge was made
	 * @param day: the day the charge was made
	 * @param purchasedBoat: the boat that was purchased
	 * @param companyName: the company that purchased the boat
	 * @param chargedCard: the card used to pay for the boat
	 */
	public CreditCardCharge(int year, int month, int day, Boat purchasedBoat, String companyName, CreditCard chargedCard) {
		this.year = year;
		this.month = month;
		this.day = day;
		
		this.purchasedBoat = purchasedBoat;
		this.companyName = companyName;
		this.chargedCard = chargedCard;
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
