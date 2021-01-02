package Targilim2;
import java.util.Scanner;
public class Targil8 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter N: ");
		int N = input.nextInt();
		int sum = 0;
		
		while (N != -1)
		{
			if (N%2 == 0)
			{
				System.out.println(N);
			}
			N--;
		}
	}

}
