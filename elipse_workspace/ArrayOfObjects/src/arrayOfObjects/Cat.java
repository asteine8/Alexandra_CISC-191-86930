package arrayOfObjects;

public class Cat {
	private String name;
	private int age;
	
	public Cat(String n, int a) {
		name = n;
		age = a;
	}
	
	@Override
	public String toString() {
		return name + " the cat is " + age + " years old";
	}
}