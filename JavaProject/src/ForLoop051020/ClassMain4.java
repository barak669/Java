package ForLoop051020;

import java.util.Scanner;

public class ClassMain4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num, sum=0, counter_even=0, counter_odd=0, temp;
		
		System.out.println("enter number");
		num= input.nextInt();
		
		for (int i = 1; i < num; i++)
		{
			if (num%i == 0)
				sum += i;
	    }
		if ( sum == num)
			System.out.println(num);
		
		
		input.close();
	}
	
}

