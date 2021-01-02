package Functions;
import java.util.Scanner;
public class Targil2 {
	
	public static int checkFunc5(String num, int counter)	
	{
		int sum = 0;
		
		for ( int i=0; i<num.length(); i++)
		{
			sum = Integer.parseInt(num.charAt(i)+"");
			if (sum == 5)
			{
				counter++;
			}
		}
		return counter;
	}
	

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("enter your number");
		String num = input.nextLine();
		int counter = 0;
		
		int c = checkFunc5(num, counter);
		System.out.println("the user number"+" "+ c);
		
		for (int i=5; i<=200; i++)
		{
			String s=String.valueOf(i);
			int f = checkFunc5(s, counter);
			System.out.format("Number 5 within %d is %d.%n" ,i,f);
		}
		
		
		

	}

}
