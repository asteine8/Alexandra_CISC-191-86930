package coffeeTableTester;

public class Coffee {
	private String dateMade;
	private String coffeeType;
	
	public Coffee(String type) {
		coffeeType = type;
		dateMade = java.time.LocalDate.now().toString();
	}
	
	public Coffee() {
		coffeeType = "regular";
		dateMade = java.time.LocalDate.now().toString();
	}
	
	public String toString() {
		return String.format("%s coffee made on %s", coffeeType, dateMade);
	}
}
