package YAIP4;

public class Mammal extends Animal {
	
	public Mammal(String name) {
		super(name);
	}

	
	public String toString() {
		return "Mammal [" + super.toString() + "]";
	}
	
	public static void main(String[] args) {
		Mammal p1 = new Mammal("demba");
		Mammal p2 = new Mammal("kamara");
		
		System.out.println(p1);
		System.out.println(p2.toString());
	}
}
