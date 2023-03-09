package Banking;

public class Control {
	public static void main(String[] args){

		Account Employee1 = new Account("Employee1", 76785, false);
		DepositAccount Employee2 = new DepositAccount("Employee2", 69420, true, 15);
		CurrentAccount Employee3 = new CurrentAccount("Employee3", 87654,true);
		
		System.out.println("Employee1");
		Employee1.deposit(1224324);
		Employee1.withdraw(1);
		Employee1.getDetails();
		Employee1.valuableAccount();
		Employee1.isInCredit();
		Employee1.currentNumber();
		
		System.out.println("Employee2");
		Employee2.deposit(12348);
		Employee2.getDetails();
		Employee2.valuableAccount();
		Employee2.withdraw();
		Employee2.isInCredit();
		Employee2.currentNumber();
		
		System.out.println("Employee3");
		Employee3.deposit(45);
		Employee3.withdraw(5000);
		Employee3.checkCredit();
		Employee3.checkCredit("You have no money");
		Employee3.getDetails();
		Employee3.valuableAccount();
		Employee3.currentNumber();
		
	}
}
