package Banking;

public class CurrentAccount extends Account{
	private double penalty;
	private int CcurNum;
	
	CurrentAccount(String Name, int Number, boolean credit) {
		super(Name, Number, credit);
	}
	public void withdraw(double takeAmount) {
		this.setAcctBalance(this.getAcctBalance() - takeAmount);
		this.penalty = this.penalty + 10;
			if(this.getAcctBalance() < 0) {
				this.setInCredit(false);
			}
	}
			
	public void checkCredit() {
		System.out.println(getInCredit());
		System.out.println(getAcctBalance());
	}
	
	public void checkCredit(String WarningMessage) {
		System.out.println(getInCredit());
		System.out.println(getAcctBalance());
		System.out.println(WarningMessage);
	}
	
	
	

}
