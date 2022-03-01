package cisc191.sdmesa.edu;

public class PickupTruck extends Vehicle {

	public int cargoCapacity;
	
	public PickupTruck(String manufacturerName, int miles, int price, int numSeats, Option[] options) {
		super(manufacturerName, miles, price, numSeats, options);
		cargoCapacity = 0;
	}
	
	public PickupTruck(String manufacturerName, int miles, int price, int numSeats, Option[] options, int cargoCapacity) {
		super(manufacturerName, miles, price, numSeats, options);
		this.cargoCapacity = cargoCapacity;
	}
	
	public int getCargoCapacity() {
		return cargoCapacity;
	}

}
