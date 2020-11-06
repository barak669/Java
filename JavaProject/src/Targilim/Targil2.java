package Targilim;

import java.util.Scanner;

public class Targil2 {
	

	public static int absolute(int num)
	{
		int sum = 0;
		if (num < 0)
		{
			sum = (num) - (num*2);
		}
		else
		{
			return num;
		}
			
		return sum;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int sum = 0;
		System.out.println("Enter an Absolute number: ");
		int num = input.nextInt();
		num = absolute(num);
		System.out.println(num);
		

	}

}
