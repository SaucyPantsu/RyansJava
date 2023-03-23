package FileProcessing;

public class Person {
	private String firstName;
	private String surName;
	private Date dateOfBirth;
	private String gender;
	
	public Person(String first, String second, int day, int month, int year, String gender) {
		this.firstName = first;
		this.surName = second;
		this.dateOfBirth = new Date(day, month, year);
		this.gender = gender;
		
	}
	
	public String toString() {
		return("Name: "+firstName+" "+surName+"\nDate of Birth: "+dateOfBirth+"\nGender:"+gender);
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getSurName() {
		return surName;
	}
	public void setSurName(String surName) {
		this.surName = surName;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

}
