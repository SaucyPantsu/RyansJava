package Banking;

public class Account implements ValidatedAccount {
	private String accountName;
	private int accountNumber;
	private boolean inCredit;
	private double acctBalance;
	public static int currentNumber = 1000;
	
	Account(String Name, int Number, boolean credit) {
		this.accountName = Name;
		this.accountNumber = Number;
		this.setInCredit(credit);
		this.accountNumber=Account.currentNumber++;

	}

	public void currentNumber() {
		System.out.println("Current Number: "+Account.currentNumber);
	}
	public void deposit(double depAmount) {
		this.setAcctBalance(this.getAcctBalance() + depAmount);
	}
	
	public void withdraw(double takeAmount) {
		this.setAcctBalance(this.getAcctBalance() - takeAmount);
		if(this.getAcctBalance() < 0) {
			this.setInCredit(false);
		}
	}

	public double getAcctBalance() {
		return acctBalance;
	}

	public void setAcctBalance(double acctBalance) {
		this.acctBalance = acctBalance;
	}

	public boolean isInCredit() {
		return inCredit;
	}

	public void setInCredit(boolean inCredit) {
		this.inCredit = inCredit;
	}
	
	public boolean getInCredit() {
		return(this.inCredit);
	}
	
	public void getDetails() {
		System.out.println("Name: "+this.accountName+"\nBalance: "+this.acctBalance);
	}
	
	public void valuableAccount() {
		System.out.println("Balance: "+this.acctBalance);
	}

}
