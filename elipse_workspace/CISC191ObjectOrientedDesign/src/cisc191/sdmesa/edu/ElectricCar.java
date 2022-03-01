package cisc191.sdmesa.edu;

public class ElectricCar extends Car implements Chargeable {
	
	private int batteryCharge = 0;

	public ElectricCar(String manufacturerName, int miles, int price, int numSeats, Option[] options) {
		super(manufacturerName, miles, price, numSeats, options);
	}

	public ElectricCar(String manufacturerName, int miles, int price, int numSeats, Option[] options,
			int numberOfDoors) {
		super(manufacturerName, miles, price, numSeats, options, numberOfDoors);
	}

	public int getBatteryCharge() {
		return batteryCharge;
	}

	public void chargeUp() {
		batteryCharge += 100;
	}
}
