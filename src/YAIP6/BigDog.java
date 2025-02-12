package YAIP6;

public class BigDog extends Dog{
	
	public BigDog(String name) {
		super(name);
	}
	
	public void greets() {
		System.out.println("Wooow");
	}
	
	public void greets(Dog another) {
		System.out.println("Woooooow");
	}
	
	public void greets(BigDog another) {
		System.out.println("Wooooooooow");
	}
	
	public static void main(String[] args) {
    	BigDog bd1 = new BigDog("Amine");
        
    	System.out.println(bd1.toString());
    }
}
