package cisc191.sdmesa.edu;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import java.awt.Color;

/**
 * Lead Author(s):
 * @author Tasha Frankie
 * @author Allan Schougaard 
 * 
 * Other contributors:
 * None
 * 
 * References:
 * Morelli, R., & Walde, R. (2016). Java, Java, Java: Object-Oriented Problem Solving.
 * https://open.umn.edu/opentextbooks/textbooks/java-java-java-object-oriented-problem-solving
 * 
 * Bechtold, S., Brannen, S., Link, J., Merdes, M., Philipp, M., Rancourt, J. D., & Stein, C. (n.d.). 
 * JUnit 5 user guide. JUnit 5. 
 * https://junit.org/junit5/docs/current/user-guide/
 * 
 * Version/date: 1.0  
 * 
 * Responsibilities of class:
 * Test class and methods to support a boat shop
 */

/**
 * Your mission, should you choose to accept it:
 * 
 * For each of the test methods below create a method in the boat class that
 * makes the test run and pass.
 * 
 * Read the test methods to understand what the ArrayChallenge class methods
 * should do. The assertEquals methods check to see if the two arguments are
 * equal. If they are equal the test passes; if not, the test will be marked as
 * failed and the execution stops.
 * 
 * To run the tests from the main menu, select Run -> Run.
 * 
 * To implement a test method:
 * 
 * 1. Uncomment the entire test method. To uncomment a block, select the block
 * and hold down Ctrl while typing /
 * 
 * 2. To make the test compile and run: implement a method with the correct
 * signature, but returning a fake value, such as -1, null or similar. After
 * this the test method should run but fail.
 * 
 * 3. To make the tests pass: Then change the method to return the correct value
 * and run the test again.
 * 
 */
class TestObjectsAndClasses
{

	@Test
	void testNoArgConstructor()
	{
		Boat boat = new Boat();
		assertEquals(null, boat.getMake());
		assertEquals(null, boat.getColor());
		assertEquals(0, boat.getSpeed());
		assertEquals(-1, boat.getPrice());
	}

//	@Test
//	void testConstructor()
//	{
//		Boat boat = new Boat("Aqualina", Color.GREEN);
//		assertEquals("Aqualina", boat.getMake());
//		assertEquals(Color.GREEN, boat.getColor());
//		assertEquals(0, boat.getSpeed());
//	}
//
//	@Test
//	void testMutators()
//	{
//		Boat boat = new Boat();
//		boat.setColor(Color.GREEN);
//		assertEquals(Color.GREEN, boat.getColor());
//	    boat.setColor(Color.RED);
//	    assertEquals(Color.RED, boat.getColor());
//	    boat.setPrice(10000);
//	    assertEquals(10000, boat.getPrice());
//	}
//
//	@Test
//	void testAccumulatorMethods()
//	{
//		Boat boat = new Boat("BHM", Color.BLUE);
//		assertEquals(0, boat.getSpeed());
//		boat.speedUp();
//		assertEquals(1, boat.getSpeed());
//		boat.speedUp();
//		assertEquals(2, boat.getSpeed());
//		boat.slowDown();
//		assertEquals(1, boat.getSpeed());
//		boat.slowDown();
//		assertEquals(0, boat.getSpeed());
//	}
//
//	@Test
//	void testToString()
//	{
//		Boat boat = new Boat("BSC", Color.GREEN);
//		assertEquals("Boat: make: BSC color: java.awt.Color[r=0,g=255,b=0]", boat.toString());
//		
//		Boat boat2 = new Boat("Marlin", Color.RED);
//		assertEquals("Boat: make: Marlin color: java.awt.Color[r=255,g=0,b=0]", boat2.toString());
//	}
//
//	@Test
//	void testEquals()
//	{
//		Boat boat1 = new Boat("BMC", Color.GREEN);
//		Boat boat2 = new Boat("BMC", Color.GREEN);
//		Boat boat3 = new Boat("BMX", Color.GREEN);
//		Boat boat4 = new Boat("BMC", Color.RED);
//		assertEquals(true, boat1.equals(boat1));
//		assertEquals(true, boat1.equals(boat2));
//		assertEquals(false, boat1.equals(boat3));
//		assertEquals(false, boat1.equals(boat4));
//		assertEquals(false, boat1.equals(null));
//		assertEquals(false, boat1.equals(new Boat()));
//	}
//
//	@Test
//	void testCreateNewSerialNumber()
//	{
//		// The boat class creates unique serial numbers for the boats
//		assertTrue(Boat.createNewSerialNumber() > 0);
//      // Serial numbers are monotonically increasing
//		assertEquals(Boat.createNewSerialNumber() + 1,  Boat.createNewSerialNumber());
//	}
//
//	@Test
//	void testSerialNumber()
//	{
//		// Every boat gets a unique serial number when they are produced
//		Boat boat1 = new Boat("BMC", Color.GREEN);
//		assertTrue(boat1.getSerialNumber() > 0);
//		Boat boat2 = new Boat("BMX", Color.RED);
//		assertEquals(boat1.getSerialNumber() + 1, boat2.getSerialNumber());
//	}
//
//	@Test
//	void testboatStock()
//	{
//		Boat boat1 = new Boat("BMC", Color.GREEN);
//		Boat boat2 = new Boat("BMX", Color.RED);
//		Boat boat3 = new Boat("UXB", Color.YELLOW);
//		
//		Harbor stock = new Harbor(5);
//		assertEquals(null, stock.getBoatAt(0));
//		assertEquals(null, stock.getBoatAt(1));
//		assertEquals(null, stock.getBoatAt(2));
//		assertEquals(null, stock.getBoatAt(3));
//		assertEquals(null, stock.getBoatAt(4));
//		
//		// Hint: parkBoatAt is not just a accessor, and not just a mutator
//		assertEquals(null, stock.parkBoatAt(boat1, 3));
//		Boat retrievedBoat = stock.parkBoatAt(boat2, 3);
//		assertEquals(boat1, retrievedBoat);
//		retrievedBoat = stock.parkBoatAt(boat3, 3);
//		assertEquals(boat2, retrievedBoat);
//		Boat[] inventory = stock.getInventory();
//		assertArrayEquals(new Boat[]{null, null, null, boat3, null}, inventory);
//		stock.parkBoatAt(boat2, 1);
//		assertArrayEquals(new Boat[]{null, null, null, boat3, null}, inventory); // this is correct!
//		assertArrayEquals(new Boat[]{null, boat2, null, boat3, null}, stock.getInventory());
//	}
//
//	@Test
//	void testCreditCardPayment()
//	{
//		Person person = new Person("Alex Keaton", "619-555-1212", "92111");
//		assertEquals("Alex Keaton 619-555-1212 92111", person.toString());
//		
//		CreditCard card = new CreditCard("4444111122223333", "12/24", "123", person);
//		assertEquals("4444111122223333 12/24 123 Alex Keaton", card.toString());
//		
//		Boat boat = new Boat("SpeedyBoat", Color.GREEN);
//		boat.setPrice(19995);
//				
//		CreditCardCharge charge = new CreditCardCharge(2020, 8, 14, boat, "BoatCo", card);
//		assertEquals("2020/8/14 4444111122223333 12/24 123 Alex Keaton BoatCo SpeedyBoat $19995", charge.toString());
//	}	

}
