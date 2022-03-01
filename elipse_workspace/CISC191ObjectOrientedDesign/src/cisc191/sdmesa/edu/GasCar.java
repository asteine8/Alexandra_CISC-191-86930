package cisc191.sdmesa.edu;

public class GasCar extends Car implements Combustible {
	
	private int fuelLevel = 0;

	public GasCar(String manufacturerName, int miles, int price, int numSeats, Option[] options) {
		super(manufacturerName, miles, price, numSeats, options);
	}

	public GasCar(String manufacturerName, int miles, int price, int numSeats, Option[] options, int numberOfDoors) {
		super(manufacturerName, miles, price, numSeats, options, numberOfDoors);
	}

	public int getFuelLevel() {
		return fuelLevel;
	}

	public void tankUp() {
		fuelLevel += 100;
	}

}
