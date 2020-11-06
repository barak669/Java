package Targilim;

import java.util.Scanner;

public class Targil6 {

	public static void secondNum(int num1, int num2) 
	{
		int temp = 0;
		temp = num1;
		num1 = num2;
		num2 = temp;
		
		System.out.println("A=" + num1 +" "+ "B=" + num2);
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
