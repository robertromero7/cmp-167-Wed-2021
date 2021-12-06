package week10;

public class BankAccount {
	public static int number;
	private static double balance;
	private static int accountNumbers;
	
	public BankAccount() {
		this.number = ++accountNumbers;
		
	}

	public static void deposit(double amount) {
		if(amount>=0.0) {
			balance += amount;
			displayMessage('d',true,amount);
		}else {
			displayMessage('d',false,amount);
		}
	}
	public static void withdraw(double amount) {
		if((balance-amount)>= 0.0) {
			balance -= amount; 
			displayMessage('w',true,amount);
		}else {
			displayMessage('w',false,amount);
		}
	}
	public String toString() {
		
		return "Account #" + number + ", balance: $" + balance;
	}
	
	public static void displayMessage(char type, boolean state, double amount) {
		String message1 = "";
		String message2 = "";
		if(type == 'd') {
			message1 = " have been deposited to ";
			message2 = " Invalid amount";
		}else if(type == 'w'){ 
			message1 = " have been withdrawn from ";
			message2 = " Insufficient amount";
		}
		if(state) {
			try {
				System.out.println("Transaction successful, $" + amount + message1 + "account #" + number + "\nNew Balance: $" + balance);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else{
			System.out.println("Transaction unsuccessful," + message2);
		}
	}
	
}
