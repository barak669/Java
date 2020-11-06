package Targilim;

import java.util.Scanner;

public class Targil4 {
	
	public static int Sum(int num1, int num2, int num3)
	{
		int temp = 0;
		if (num1 > num2 && num1 > num3)
		{
			return num1;
		}
		if (num2 > num1 && num2 > num3)
		{
			return num2;
		}
		else 
		{
			return num3;
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("enter first number: ");
		int num1 = input.nextInt();
		System.out.println("enter second number: ");
		int num2 = input.nextInt();
		System.out.println("enter third number: ");
		int num3 = input.nextInt();
		int s = Sum(num1, num2, num3);
		System.out.println(s);

	}

}
