package java_practice;



	public class gradeBook{
		private String courseName;
		private String Professor;
		
	public gradeBook(String name, String professor) {//constructor
		courseName=name;
		Professor=professor;
	}
	public void setProfessorName(String name) {
		Professor=name;
	}
	public String getProfessorName() {
		return Professor;
	}
	//end of constructor
	public void setCourseName(String name) {
		courseName=name;
	}
	public String getCourseName() {
		return courseName;
	}
	public void displayMessage() {
		System.out.printf("welcome to the \n%s!\n",getCourseName());
		
	}
	}
	


	

	


