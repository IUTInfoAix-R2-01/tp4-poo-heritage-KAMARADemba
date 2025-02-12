package YAIP6;

public class Cat extends Animal{
	
	public Cat (String name) {
		super(name);
	}
	
	public void greets() {
		System.out.println("Meow");
	}

	@Override
	public String toString() {
		return "Cat [" + super.toString() + "]";
	}
	
	public static void main(String[] args) {
    	Cat c1 = new Cat("Isma");
        
    	System.out.println(c1.toString());
  
    }
	
}