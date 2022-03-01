package cisc191.sdmesa.edu;

public class SportsUtilityVehicle extends Vehicle {
	
	private int maxTowingWeight;

	public SportsUtilityVehicle(String manufacturerName, int miles, int price, int numSeats, Option[] options) {
		super(manufacturerName, miles, price, numSeats, options);
		this.maxTowingWeight = 0;
	}
	
	public SportsUtilityVehicle(String manufacturerName, int miles, int price, int numSeats, Option[] options, int maxTowingWeight) {
		super(manufacturerName, miles, price, numSeats, options);
		this.maxTowingWeight = maxTowingWeight;
	}
	
	public int getMaxTowingWeight() {
		return maxTowingWeight;
	}

}
