package YAIP4;

public class Dog extends Animal {

	public Dog(String name) {
		super(name);
	}
	
	public void greets() {
		System.out.println("Woof");
	}
	
	public void greets(Dog another) {
		System.out.println("Woooof");
	}
	
	public String toString() {
		return "Dog [" + super.toString() + "]";
	}
	
	public static void main(String[] args) {
		Dog p1 = new Dog("demba");
		Dog p2 = new Dog("kamara");
		
		System.out.println(p1);
		System.out.println(p2.toString());
	}
}
