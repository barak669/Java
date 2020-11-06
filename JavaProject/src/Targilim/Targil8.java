package Targilim;

import java.util.Scanner;

public class Targil8 {

	public static void secondNum(int A, int B, int C) 
	{
		int temp = 0;
		if (A > B && A > C)
		{
			System.out.println("A=" + A +" "+ "B=" + B + " "+ "C=" + C);
		}
		
		else if (B > A && B > C)
		{
			temp = A;
			A = B;
			B = temp;
			System.out.println("A=" + A +" "+ "B=" + B + " "+ "C=" + C);
		}
		
		else {
			temp = A;
			A = C;
			C = temp;
			System.out.println("A=" + A +" "+ "B=" + B + " "+ "C=" + C);
		}
	}
		
	

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("enter A: ");
		int num1 = input.nextInt();
		
		System.out.println("enter B: ");
		int num2 = input.nextInt();
		
		System.out.println("enter C: ");
		int num3 = input.nextInt();
		
		secondNum(num1, num2, num3);
		

	}
}
