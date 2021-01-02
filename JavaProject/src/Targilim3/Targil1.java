package Targilim3;
import java.util.Scanner;
public class Targil1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("enter first number: ");
		int num1 = input.nextInt();
		
		System.out.println("enter second number: ");
		int num2 = input.nextInt();
		
		System.out.println("enter third number: ");
		int num3 = input.nextInt();
		
		int sum = num1 + num2 + num3;
		System.out.println("the sum of "+ num1 + "+" +num2 + "+" +num3 + " are: " + sum);
		}
}
