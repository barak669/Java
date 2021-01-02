package Task14012020.Task5;

import java.util.Scanner;

public class Task5 {
	
	public static boolean doo(int x) 
	{
		int temp = 0;
		while(x != 0) 
		{
			int num = 0;
			temp = x % 10;
			x /= 10;
			if (temp % 2 != 0) 
			{
			  return false; 
			}
			else
			{
				num =+ temp;
			}
		}
		if (temp %2 == 0)
		{
			return true;
		}
		return doo(x);
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter your number: ");
	    int num = input.nextInt();
	    
		boolean c =doo(num);
		System.out.println(c);
	}

}
