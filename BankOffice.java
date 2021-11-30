package week10;
import java.util.*;

//implement the deposit and the withdraw method on the Bank class and BankOffice


public class BankOffice {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome!");
		System.out.println("Enter a name for the bank: ");
		String bankName = input.nextLine();
		System.out.println("Enter the address: " );
		String bankAddress = input.nextLine();
		
		Bank bank = new Bank(bankName, bankAddress);
		
		while(true) {
			System.out.println("Would you like to create an account?");
			String answer = input.nextLine().toLowerCase();
			double answer1;
			if(answer.equals("y") || answer.contains("yeah") || answer.contains("yes") || answer.contains("yep")) {
				System.out.print("Enter checking for checking account, saving for savings account, other for any account ");
				answer = input.nextLine().toLowerCase();
				switch(answer){
					case "checking" : {
						bank.openAccount('c');
						System.out.print("Would you like to Withdraw or Deposit Money into your checkings account?");
						answer = input.nextLine().toLowerCase();
						if(answer.equals("deposit")) {
							System.out.print("Ok, how much would you like to deposit?");
							answer1 = input.nextInt();
							BankAccount.deposit(answer1);
						}else if(answer.equals("withdraw")) {
							System.out.print("Ok, how much would you like to withdraw?");
							answer1 = input.nextInt();
							BankAccount.withdraw(answer1);
						
						}
						break;
					}
					case "saving" :
						bank.openAccount('s');
						System.out.print("Would you like to Withdraw or Deposit Money into your savings account?");
						answer = input.nextLine().toLowerCase();
						if(answer.equals("deposit")) {
							System.out.print("Ok, how much would you like to deposit?");
							answer1 = input.nextInt();
							BankAccount.deposit(answer1);
						}else if(answer.equals("withdraw")) {
							System.out.print("Ok, how much would you like to withdraw?");
							answer1 = input.nextInt();
							BankAccount.withdraw(answer1);
						
						}
						break;
					case "other" :
						bank.openAccount('o');
						System.out.print("Would you like to Withdraw or Deposit Money into your account?");
						answer = input.nextLine().toLowerCase();
						if(answer.equals("deposit")) {
							System.out.print("Ok, how much would you like to deposit?");
							answer1 = input.nextInt();
							BankAccount.deposit(answer1);
						}else if(answer.equals("withdraw")) {
							System.out.print("Ok, how much would you like to withdraw?");
							answer1 = input.nextInt();
							BankAccount.withdraw(answer1);
						
						}
						break;
					default:
						System.out.println("Unexpected value: " + answer);
				}
			}else if(answer.equals("no")) {
				System.out.println("Alright...");
				break;
			}
		}
		while(true) {
			System.out.println("Would you like to display all the accounts?");
			String answer = input.nextLine().toLowerCase();			
			if(answer.equals("y") || answer.contains("yeah") || answer.contains("yes") || answer.contains("yep")) {
				bank.displayAll();
			}
			else if(answer.equals("no")) {
				System.out.println("Alright...");
				break;
				}
		}
		System.out.println("_____________________________________________________________________________________");
		System.out.println(bank);
	}

}
