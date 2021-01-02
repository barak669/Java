package Targilim2;
import java.util.Scanner;
public class Targil6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter N: ");
		int N = input.nextInt();
		int sum = 0;
		
		for (int i=0; i<=N; i++)
		{
			if (i%2 == 0)
			{
				sum= sum + i;
				System.out.println(i);
			}
		}
		System.out.println("the sum is: " + sum);
		

	}

}
