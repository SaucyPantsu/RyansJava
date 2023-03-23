package FileProcessing;

import java.io.FileNotFoundException;

public class Job {
	private double Salary;
	private String Role;
	private int jobID;
	
	public Job(double salary, String Role, int ID) throws FileNotFoundException {
		this.setSalary(salary);
		this.setRole(Role);
		this.setJobID(ID);
				if(FileProcessing.Checkfile("roles.txt",Role ) == false) {
					this.setRole("NULL");
		}
		
	}

	// getters and setters
	public double getSalary() {
		return Salary;
	}

	public void setSalary(double salary) {
		Salary = salary;
	}

	public String getRole() {
		return Role;
	}

	public void setRole(String role) {
		Role = role;
	}

	public int getJobID() {
		return jobID;
	}

	public void setJobID(int jobID) {
		this.jobID = jobID;
	}
	
	public String toString() {
		return("Job: "+Role+"\nJobID: "+jobID+"\nSalary: "+Salary);
	}
}
