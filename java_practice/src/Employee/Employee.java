package Employee;

public class Employee {
	private String firstName;
	private String lastName;
	private double salary;
	
	//constructor
	public Employee(String f,String l, double s) {
		firstName=f;
		lastName=l;
		salary=s;
	}
//end of constructor
	
	public void setFirstName(String s) {
		firstName=s;
	}
	public String getFirstName() {
		return firstName;
	}
	
	public void setLastName(String s) {
		lastName=s;
	}
	public String getLastName() {
		return lastName;
	}
	public void setSalary(double s) {
		salary=s;
	}
	public double getSalary() {
		return salary;
	}
	
	public void bonus(float d) {
		d= (float) ((d*100)/salary);
		salary+=d;
		
	}
	
}
