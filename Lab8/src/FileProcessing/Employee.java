package FileProcessing;

public class Employee extends Person{
	private Job job;
	private int personnelNumber;
	private Date startDate;
	private int nextNumber;

	public Employee(String first, String second, int day, int month, int year, String gender, Job job, int Number,  int sday, int smonth, int syear, int nextNum) {
		super(first, second, day, month, year, gender);
		// TODO Auto-generated constructor stub
		this.job = job;
		this.personnelNumber = Number;
		this.startDate = new Date(sday, smonth, syear);
		this.nextNumber = nextNum;
	}

	public Job getJob() {
		return job;
	}

	public void setJob(Job job) {
		this.job = job;
	}

	public int getPersonnelNumber() {
		return personnelNumber;
	}

	public void setPersonnelNumber(int personnelNumber) {
		this.personnelNumber = personnelNumber;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public int getNextNumber() {
		return nextNumber;
	}

	public void setNextNumber(int nextNumber) {
		this.nextNumber = nextNumber;
	}
	
	public String toString() {
		FileProcessing filewrite = new FileProcessing("names.txt", "Test");
		filewrite.toString(super.getFirstName(), super.getSurName());
		return(super.toString()+"\nRole: "+job+"\nStart Date:" +startDate);
	}
	
}
