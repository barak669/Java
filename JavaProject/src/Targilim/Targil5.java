package Targilim;

import java.util.Scanner;

public class Targil5 {
	
	public static int secondNum(int num1, int num2, int num3) 
	{
		if (num1 > num2 && num1 > num3)
		{
			if (num2 > num3)
			{
				return num2;
			}
		}
		if (num2 > num1 && num2 > num3)
		{
			if (num1 > num3)
			{
				return num1;
			}
		}
		else {
			return num3;
		}
		return 0;
		
	}

	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("enter your first number: ");
		int num1 = input.nextInt();
		
		System.out.println("enter your second number: ");
		int num2 = input.nextInt();
		
		System.out.println("enter your third number: ");
		int num3 = input.nextInt();
		
		int temp = secondNum(num1, num2, num3);
		System.out.println(temp);

	}

}
