package Lab4;

public class HourlyEmployee extends Employee {
	String euro = "\u20AC";
	private double hoursWorked;
	private double hourlyRate;

	public HourlyEmployee(String name, String surname, int number, double hours, double rate ) {
		super(name, surname, number, 0);
		this.setHoursWorked(hours);
		this.setHourlyRate(rate);
	}
	
	public double calculatePay() {
		double pay = hourlyRate*hoursWorked;
		return pay;
	}

	public double getHoursWorked() {
		return hoursWorked;
	}

	public void setHoursWorked(double hoursWorked) {
		this.hoursWorked = hoursWorked;
	}

	public double getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}
	public String toString() {
		return(super.getFirstName() +" "+this.getSurName()+"\n"+"Week's pay:"+euro+(this.hoursWorked*this.hourlyRate)+"\nEmployeeNumber:"+this.getStaffNumber()+"\n\n");
	}

}
