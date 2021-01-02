package Targilim4;
import java.util.Scanner;
public class Targil7 {
	public static void func(int num)
	{
		int leftNumber = 0;
		int rightNumber = 0;
		leftNumber = num %10;
		rightNumber = num /10;
		if (leftNumber == rightNumber)
		{
			System.out.println(leftNumber +" "+ rightNumber +" "+ "are equals");
		}
		else
		{
			System.out.println(leftNumber +" "+ rightNumber +" "+ "are not equals!!!");
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("enter a number:");
		int num = input.nextInt();
		
		func(num);
		
		
	}

}
