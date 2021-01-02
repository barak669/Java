package Targilim2;
import java.util.Scanner;
public class Targil1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int N = input.nextInt();
		
		for (int i=0; i <= N; i++)
		{
			System.out.println(i);
		}
	}
}
