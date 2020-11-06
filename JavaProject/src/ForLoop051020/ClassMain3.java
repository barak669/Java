package ForLoop051020;

import java.util.Scanner;

public class ClassMain3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num, counter_even=0, counter_odd=0, temp;
		
		for (int i = 0; i <= 10; i++)
		{
			System.out.println("enter number");
			num= input.nextInt();
			
			if (num%10 > ((num/10)%10) && ((num/10)%10) > num/100)
				System.out.println(num);
			
			
	}
	}
}

