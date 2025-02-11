package YAIP4;

public class Person {
	private String name;
	private String address;
	
	public Person(String name, String address) {
		this.name = name;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String toString() {
		return "Person [name=" + name + ", address=" + address + "]";
	}
	
	public static void main(String[] args) {
		Person p1 = new Person("demba", "123 rue de Aix");
		Person p2 = new Person("kamara", "123 rue de Marseille");
		
		System.out.println(p1);
		System.out.println(p2.toString());
	}
}
