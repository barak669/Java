package Targilim3;

import java.util.Scanner;

public class Targil12 {
	public static void func(int num)
	{
		int rightNumber = 0;
		rightNumber = num % 100;
		rightNumber = rightNumber / 10;
		System.out.println("the second right number is: " + rightNumber);
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("enter number");
		int num = input.nextInt();
		
		if (num < 1000) {
			num = 0;
			System.out.println("you need the num to be between 1000 to 9999");
			System.out.println("enter number");
			num = input.nextInt();
		}
		func(num);
	}
}