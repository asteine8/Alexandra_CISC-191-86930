package cisc191.sdmesa.edu;

/**
 * CreditCard(number: String, expiration:String, securityCode: String,  cardHolder: Person)
 * @author Rain
 *
 */
public class CreditCard {
	private String number;
	private String expiration;
	private String securityCode;
	private Person cardHolder;
	
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
		return String.format("%s %s %s %s", number, expiration, securityCode, cardHolder.toString());
	}
}
