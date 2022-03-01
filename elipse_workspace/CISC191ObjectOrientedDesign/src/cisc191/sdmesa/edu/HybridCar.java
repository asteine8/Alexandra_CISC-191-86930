package cisc191.sdmesa.edu;

public class HybridCar extends Car implements Combustible, Chargeable {

	private int fuelLevel = 0;
	private int batteryCharge = 0;
	
	public HybridCar(String manufacturerName, int miles, int price, int numSeats, Option[] options) {
		super(manufacturerName, miles, price, numSeats, options);
	}

	public HybridCar(String manufacturerName, int miles, int price, int numSeats, Option[] options,
			int numberOfDoors) {
		super(manufacturerName, miles, price, numSeats, options, numberOfDoors);
	}

	public int getBatteryCharge() {
		return batteryCharge;
	}

	public void chargeUp() {
		batteryCharge += 100;
	}

	public int getFuelLevel() {
		return fuelLevel;
	}

	public void tankUp() {
		fuelLevel += 100;
	}
}
