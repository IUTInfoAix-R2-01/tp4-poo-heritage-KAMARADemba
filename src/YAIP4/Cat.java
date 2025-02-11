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
	
	public static void main(String[] args) {
		Cat p1 = new Cat("demba");
		Cat p2 = new Cat("kamara");
		
		System.out.println(p1);
		System.out.println(p2.toString());
	}
}
