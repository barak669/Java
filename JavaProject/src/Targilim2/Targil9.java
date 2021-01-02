package Targilim2;
import java.util.Scanner;
public class Targil9 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter first Number: ");
		int N = input.nextInt();
		
		System.out.println("Enter second Number: ");
		int N2 = input.nextInt();
		int sum = N;
		
		for (int i=1; i<N2; i++)
		{
			sum += N;
		}
		System.out.println("The multiplication result of two numbers is: " + sum);
	}

}
