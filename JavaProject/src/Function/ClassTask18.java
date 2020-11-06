package Function;

import java.util.Scanner;

public class ClassTask18 {
	
	public static int func (int num)
	{
		int sum=0;
		while(num != 0)
		{
			sum += num%10;
			num/=10;
		}
		return sum;
	}

	
	

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int num=9; 
		int num1=9; 
		
		while(num != 0 || num1 != 0)
		{
			System.out.println("enter number");
			num = input.nextInt();
			System.out.println("enter number1");
			num1 = input.nextInt();
			
			if (num != 0 || num1 != 0)
			{
				if (func(num1) == func(num))
				{
					System.out.println(num +" "+ num1 + "yes");
				}
				else 
				{
					System.out.println(num +" "+ num1 + "no");
				}
				}

		}
	}

}
