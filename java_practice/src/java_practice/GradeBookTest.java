package java_practice;

import java.util.Scanner;

public class GradeBookTest{
	public static void main(String[] arg) {
		Scanner input=new Scanner(System.in);
	
			gradeBook gb1=new gradeBook(null, null);
	System.out.printf("Enter your Course name:");
	String name=input.nextLine();
	gb1.setCourseName(name);
	gradeBook p2=new gradeBook(name, name);
	System.out.printf("Enter your Professor name:");
	String pname=input.nextLine();
	
	p2.setProfessorName(pname);
	
	
	System.out.printf("gradebook course name is:\n%s!\n",gb1.getCourseName());
	System.out.printf("Professor name is:\n%s!\n",p2.getProfessorName());
	
	
	
	}
}
