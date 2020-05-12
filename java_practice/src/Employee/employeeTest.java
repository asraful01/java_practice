package Employee;

import java.util.Scanner;

public class employeeTest {
	
	public static void main(String[]args) {

	Employee em1=new Employee(null, null, 0);
	//Employee em2=new Employee(null,null,0);
	
	float b;
	
	Scanner input=new Scanner (System.in);
	
	System.out.print("Enter First Name:");
	String f=input.nextLine();
	em1.setFirstName(f);
	System.out.print("Enter Last Name:");
	String l=input.nextLine();
	em1.setLastName(l);
	System.out.print("Enter Salary:");
	double s=input.nextDouble();
	em1.setSalary(s);
	System.out.printf("Your first Name is:\n%s\n",em1.getFirstName());
	System.out.printf("Your last Name is:\n%s\n",em1.getLastName());
	System.out.printf("Your salary is: $%.2f\n",em1.getSalary());
	
	System.out.print("Enter Raise:");
	b=input.nextFloat();
	em1.bonus(b);
	em1.setSalary(s+b);
	
	
	System.out.printf("Your first Name is:\n%s\n",em1.getFirstName());
	System.out.printf("Your last Name is:\n%s\n",em1.getLastName());
	System.out.print("Your salary is: $"+em1.getSalary()+ " with "+ b+ "% Raise");
	
	
	
	
	
	
}
}
