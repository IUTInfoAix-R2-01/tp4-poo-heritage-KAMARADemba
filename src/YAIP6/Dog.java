package YAIP6;

public class Dog extends Animal{
	
	public Dog (String name) {
		super(name);
	}
	
	public void greets() {
		System.out.println("Woof");
	}
	
	public void greets(Dog another) {
		System.out.println("Woooof");
	}

	@Override
	public String toString() {
		return "Dog [" + super.toString() + "]";
	}
	
	public static void main(String[] args) {
    	Dog d1 = new Dog("Demba");
        
    	System.out.println(d1.toString());
    }
}