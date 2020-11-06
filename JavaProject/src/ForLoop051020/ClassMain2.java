package ForLoop051020;

import java.util.Scanner;

public class ClassMain2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num, counter_even=0, counter_odd=0;
		
		for (int i = 10; i <= 9; i++)
		{
			System.out.println("enter number");
			num= input.nextInt();
			
			while (num != 0)
			{
				if((num%10)%2 == 0)
				{
					counter_even++;
				}
				else
					counter_odd++;
			}
			if (counter_even > counter_odd)
			{
				System.out.println(num);
			}
		}
	}
}
