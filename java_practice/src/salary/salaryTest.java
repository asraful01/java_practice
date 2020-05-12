package salary;

import java.util.Scanner;

public class salaryTest {

	public static void main(String[] args)
    {
        salary person = new salary(0,0,0,0);

        Scanner input = new Scanner(System.in);

        int employee = 1; //setting account to 1 here so it will be initialized in the while loop
        int h;
       double r;
       double e;

        while (person.setEmployee(employee) != 0) //As long as the account number is not set to 0 program will continue to loop
        {
        	System.out.println("Please enter your employee#: ");
            employee = input.nextInt();
            person.setEmployee(employee); 
            
            System.out.println("Please enter your working hours: ");
            h = input.nextInt();
            person.setHours(h); 
            
            System.out.println("Please enter your working rate: ");
            r = input.nextDouble();
            person.setRate(r); 
                       
            if (person.getHours()>40)
            {
            		double bonus=(person.getHours()-40)*(person.getRate()/2);
            	e=(person.getRate()*person.getHours());
            	person.setSalary(e);
            	System.out.printf("Your salary is:$%.2f\n", e+bonus);
            	
            	
               
            }
            else {
            	e=(person.getRate()*person.getHours());
            	person.setSalary(e);
            	System.out.printf("Your salary is:$%.2f\n", e);
            	
            }
         

        }  
    }
}
