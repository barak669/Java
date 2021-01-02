package Targilim5;
import java.util.Scanner;
public class Targil7 {

	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("enter number");
		int num = input.nextInt();
		int counter = 0;
	
		
		while (num != 0)
		{
			if (num%2 != 0)
			{
				counter++;
			}
			num /=10;
		}
		System.out.println(counter);
	

		

	}

}
