package week10;

public class CheckingAccount extends BankAccount{
	private double interest = 0.075;
	public int withdrawCounter = 1;
	
	public static void main(String [] args) {
		CheckingAccount acct = new CheckingAccount();
		acct.deposit(1000000);
		
		CheckingAccount acct2 = new CheckingAccount();
		acct2.deposit(500);
		System.out.println();
		for(int i = 0; i < 5; i++) {
			acct.withdraw(1000);
		}
		
	}
	
	public void withdraw(double amount) {
		if(withdrawCounter < 4) {
			super.withdraw(amount);
			withdrawCounter++;
		}else {
			double chargedInterest = amount*interest;
			System.out.println("Interest to be charged " + chargedInterest);
			amount = amount - chargedInterest;
			super.withdraw(amount);
			withdrawCounter = 1;
		}
	}
	
	public String toString() {
		return "Type: Checking, " +  super.toString() + ", Interest: %" + interest;
	}

}

//create SavingAccount that will inherit from BankAccount
//have unique methods and instance variables
//make sure that the toString methods matches with the SavingAccount
//Test it out
