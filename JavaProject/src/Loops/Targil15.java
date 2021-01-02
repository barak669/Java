package Loops;

import java.util.Scanner;

public class Targil15 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("enter a number: ");
		int num = input.nextInt();
		int sum = 0;
		
		while (num != 0)
		{
			sum += num%10;
			num/=10;
		}
		
		
		if (sum > 9)
		{
			sum = (sum%10) + (sum/10);
		}	
		System.out.println(sum);
	}
}
