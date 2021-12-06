import java.util.*;
public class RecursionHomework {
	public static Scanner keyboard = new Scanner(System.in);
	public static void main(String [] args) {
		int x = keyboard.nextInt();
		
		 x = product(x);
		
		System.out.println(x);
		
	}
	public static int sumBetweenTwoNumbers(int startingNumber,int target) {
		if(target <= startingNumber) 
			return startingNumber;
		else
			return target + sumBetweenTwoNumbers(startingNumber,target-1);
		
	}
	public static int product(int target) {
		if(target <= 1) 
			return 1;
		else
			return target * product(target-1);
		
	}
	
}
