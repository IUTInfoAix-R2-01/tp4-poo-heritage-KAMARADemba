package YAIP4;

public class Cat extends Animal {
	
	public Cat(String name) {
		super(name);
	}
	
	public void greets() {
		System.out.println("Meow");
	}
	
	public String toString() {
		return "Cat [" + super.toString() + "]";
	}
	
}
