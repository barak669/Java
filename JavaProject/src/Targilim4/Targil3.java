package Targilim4;
import java.util.Scanner;
public class Targil3 {
	
	public static void func(int num1, int num2)
	{
		if(num1 < 0 && num2 > 250 )
		{
			System.out.println( (num1 + num2) / 2 );
		}
		else if(num1 >300 && (num2 > 0 || num2 <10) )
		{
			System.out.println(num1 * num2);
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("enter first number: ");
		int num1 = input.nextInt();
		
		System.out.println("enter second number: ");
		int num2 = input.nextInt();
		
		func(num1, num2);
	}

}
