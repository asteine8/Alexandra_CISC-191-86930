package arrayOfObjects;

public class TestArrayOfObjects {
	
	public static void main(String[] args) {
		
		// Declare and initialize an array of Cat objects
		Cat cats[] = new Cat[3];
		
		// Assign cats to the cat array
		cats[0] = new Cat("Maki", 3);
		cats[1] = new Cat("Nori", 6);
		cats[2] = new Cat("Frank", 7);
		
		// Print out cat info to the console
		for (int i = 0; i < cats.length; i++) {
			System.out.println(cats[i].toString());
		}
		

	}
}
