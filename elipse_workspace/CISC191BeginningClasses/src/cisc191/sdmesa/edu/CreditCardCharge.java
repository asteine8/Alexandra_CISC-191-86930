package cisc191.sdmesa.edu;

/**
 * CreditCardCharge charge = new CreditCardCharge(2020, 8, 14, boat, "BoatCo", card);
assertEquals("2020/8/14 4444111122223333 12/24 123 Alex Keaton BoatCo SpeedyBoat $19995", charge.toString());
CreditCardCharge(year: int, month: int, day: int, purchasedBoat: Boat, companyName: String, chargedCard: CreditCard)
 * @author Rain
 *
 */
public class CreditCardCharge {
	private int year;
	private int month;
	private int day;
	private Boat purchasedBoat;
	private String companyName;
	private CreditCard chargedCard;
	
	public CreditCardCharge(int y, int m, int d, Boat boat, String company, CreditCard card) {
		year = y;
		month = m;
		day = d;
		
		purchasedBoat = boat;
		companyName = company;
		chargedCard = card;
	}
	
	/**
	 * 
	 */
	@Override
	public String toString() {
		return String.format("%d/%d/%d %s %s %s $%s", year, month, day, chargedCard.toString(), companyName, 
												  purchasedBoat.getMake(), purchasedBoat.getPrice());
	}
	
}
