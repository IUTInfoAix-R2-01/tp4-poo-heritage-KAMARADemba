package YAIP4;

public class Staff extends Person {
	private String school;
	private double pay;
	
	public Staff(String name, String address, String school, double pay) {
		super(name, address);
		this.school = school;
		this.pay = pay;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public double getPay() {
		return pay;
	}

	public void setPay(double pay) {
		this.pay = pay;
	}

	
	public String toString() {
		return "Staff [ "+ super.toString() + "school=" + school + ", pay=" + pay + "]";
	}
	
	public static void main(String[] args) {
		Staff p1 = new Staff("demba", "123 rue de Aix", "FAC", 4.4);
		Staff p2 = new Staff("kamara", "123 rue de Marseille", "iut", 2.2);
		
		System.out.println(p1);
		System.out.println(p2.toString());
	}
	
}
