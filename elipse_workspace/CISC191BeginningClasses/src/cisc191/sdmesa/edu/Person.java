package cisc191.sdmesa.edu;

/**
 * 
 * @author Shane Hage
 * 
 * Version/date: .9 - 2/16/2022
 *
 * Responsibilities of class:
 *
 */
public class Person
{
	private String name;
	private String phone;
	private String zip;
	
	//Holds a person's name, phone number, and zip code
	Person(String name, String phone, String zip) {
		this.name = name;
		this.phone = phone;
		this.zip = zip;
	}

	//Will return the person's name.
	public String getName() {
		return name;
	}
	
	//Will return formatted string of the person's name, phone number and zip code.
	@Override
	public String toString() {
		return String.format("Name: %s, Phone Number: %s, Zipcode: %s", name, phone, zip);
	}
	
}
