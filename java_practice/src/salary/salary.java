package salary;

public class salary {

	private int employee,hours;
	private double rate,earning;
	
	public salary(int e, int h, double r, double s) {
		employee=e;
		h=hours;
		r=rate;
		s=earning;
	}
	
	public int setEmployee(int e) {
		employee=e;
		return e;
		
	}
	public void setHours(int h) {
		hours=h;
		
	}
	public int getHours() {
		return hours;
	}
	public void setRate(double r) {
		rate=r;
		
	}
	public double getRate() {
		return rate;
	}
	public double setSalary(double s) {
		earning=s;
		return s;
	}
	
	
	
	
}
