package Recursia;

import java.util.Scanner;

public class Task2 {
	
	private static int func(int num) {
		
		if(num ==0) 
		{
			return 0;
		}
		
		else if ( (num%10)%3 == 0 )
		{
			return 1 + func(num/10);
		}
		
		else
		{
			return 0 + func(num/10); 
		}		
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter a number  : ");
	    int num = input.nextInt();

		int sum = func(num);
		System.out.println(sum);

	}

}
