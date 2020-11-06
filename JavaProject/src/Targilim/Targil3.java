package Targilim;

import java.util.Scanner;

public class Targil3 {
	
	public static int Sum(int num1, int num2)
	{
		if (num1 > num2)
		{
			return num1;
		}
		else
		{
			return num2;
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("enter first number: ");
		int num1 = input.nextInt();
		System.out.println("enter second number: ");
		int num2 = input.nextInt();
		int s = Sum(num1, num2);
		System.out.println(s);

	}

}
