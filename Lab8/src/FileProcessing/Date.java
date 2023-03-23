package FileProcessing;

public class Date {
	private int Day;
	private int Month;
	private int Year;
	
	public Date(int day, int month, int year) {
		this.setDay(day);
		this.setMonth(month);
		this.setYear(year);
	}

	//getters and setters
	public int getDay() {
		return Day;
	}

	public void setDay(int day) {
		Day = day;
	}

	public int getMonth() {
		return Month;
	}

	public void setMonth(int month) {
		Month = month;
	}

	public int getYear() {
		return Year;
	}

	public void setYear(int year) {
		Year = year;
	}
	
	public String toString() {
		return("\n"+Day+"/"+Month+"/"+Year+"\n");
	}
}
