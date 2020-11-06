package Targilim;

import java.util.Scanner;

public class Targil7 {

	public static void secondNum(int num1, int num2) 
	{
		int temp = 0;

		if (num1 > num2)
		{
			temp = num1;
		}
		else
		{
			temp = num2;
		}
		
		System.out.println("A=" + temp +" "+ "the two numbers are: " + num1 + "," + num2);
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("enter A: ");
		int num1 = input.nextInt();
		System.out.println("enter B: ");
		int num2 = input.nextInt();
		secondNum(num1, num2);
		

	}
}
