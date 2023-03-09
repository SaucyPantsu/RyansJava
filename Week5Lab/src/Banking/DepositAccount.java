package Banking;

public class DepositAccount extends Account{
	private double interestRate;

	DepositAccount(String Name, int Number, boolean credit, double Rate) {
		super(Name, Number, credit);
		this.interestRate = Rate;
	}
	
	public void withdraw() {
		System.out.println("You cannot withdraw from a deposit account");
	}

}
