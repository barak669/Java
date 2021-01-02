package Task14012020.Task4;

import java.util.Scanner;

public class Task4 {
	
	public static int doo(int x, int count) {
		
		if ( (x%10) %2 == 0 )
		{
			if (x == 0)
			{
				return count;
			}
			count++;
		}
		
		return doo(x/10, count);
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int counter=0;
		
		System.out.println("Please enter your number: ");
	    int num = input.nextInt();
	    
		int c =doo(num, counter);
		System.out.println("The amount of even numbers in your number are: " + c);
	}

}
