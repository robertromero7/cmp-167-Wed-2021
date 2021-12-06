package week10;

public class SavingAccount extends BankAccount {
	
		private static double depositInterest = .08;
		public int depositCounter = 1;
		private static double compoundInterest = .05;
		private int days = 1;
		
		public static void main(String [] args) {
			SavingAccount saving1 = new SavingAccount();
			
			
			for(int i = 0; i < 4; i++) {
				saving1.deposit(1000);
				
			}

			for(int i = 0; i < 4; i++) {
			saving1.interest(1000);
			}
		}
		public void deposit(double amount) {
			if(depositCounter < 4) {
				super.deposit(amount);
				depositCounter++;
			}else {
				double gainedInterest = amount*depositInterest;
				System.out.println("Interest to be accumulated " + gainedInterest);
				amount = amount + gainedInterest;
				super.deposit(amount);
				depositCounter = 1;
			}
		}
		public void interest(double amount) {
			if(days < 3) {
				super.deposit(amount);
				days++;
			}else {
				double gainedInterest2 = amount*compoundInterest;
				System.out.println("It has been 7 days, its time for your interest to compound, this is the amount you will gain this time $" + gainedInterest2);
				amount = amount + gainedInterest2;
				super.deposit(amount);
				days = 1;
			}
		}
		
		public String toString() {
			return "Type: Savings, " +  super.toString() + ", Interest: %" + depositInterest;
		}
			
			
		}

