import java.util.*;
public class RecursionCh12 {
	public static Scanner keyboard = new Scanner(System.in);
	
	public static int fib(int n) {
		if(n <= 1)
			return n;
		else
			return fib(n-1) + fib(n-2);
	}
	public static int sum(int target) {
		if(target <= 0) 
			return 0;
		else
			return target + sum(target-1);
		
	}
	
	
	
	//Write a recursive method for the product of all numbers from 1 to a target number
	//Write a recursive method that calculates the sum of all numbers in between of the two numbers
}
