package Lab4;

public class Employee {
	
	//variables
	private String firstName;
	private String surName;
	private int staffNumber;
	private double annualSalary;
	
	//constructor
	public Employee(String name, String surname, int number, double salary) {
		this.setFirstName(name);
		this.setSurName(surname);
		this.setStaffNumber(number);
		this.setAnnualSalary(salary);
	}
	
	public double calculatePay() {
		double monthpay = (annualSalary/12);
		return monthpay;
	}

	//getters and setters
	public int getStaffNumber() {
		return staffNumber;
	}

	public void setStaffNumber(int staffNumber) {
		this.staffNumber = staffNumber;
	}

	public String getSurName() {
		return surName;
	}
	
	public void setSurName(String surName) {
		this.surName = surName;
	}

	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public double getAnnualSalary() {
		return annualSalary;
	}

	public void setAnnualSalary(double annualSalary) {
		this.annualSalary = annualSalary;
	}
	public String toString() {
		return(this.firstName +" "+this.surName+"\n"+"Salary:€"+this.annualSalary+"\nEmployeeNumber:"+this.staffNumber +"\n\n" );
	}
}