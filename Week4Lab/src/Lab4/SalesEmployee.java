package Lab4;

public class SalesEmployee extends Employee{
	private double commissionEarned;
	public SalesEmployee(String name, String Surname, int number, double salary, double commissionEarned) {
		super(name,Surname,number,salary);
		this.setCommissionEarned(commissionEarned);
		
	}
	public double calculatePay() {
		double pay = (super.getAnnualSalary() + commissionEarned)/12;
		return pay;
	}
	public double getCommissionEarned() {
		return commissionEarned;
	}
	public void setCommissionEarned(double commissionEarned) {
		this.commissionEarned = commissionEarned;
	}
	public String toString() {
		return(super.getFirstName() +" "+this.getSurName()+"\n"+"Salary and commission:€ "+((super.getAnnualSalary() + commissionEarned)/12)+"\nEmployeeNumber:"+this.getStaffNumber()+"\n\n");
	}
}
