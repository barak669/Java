package Function;

import java.util.Scanner;

public class ClassTask16 {
	
	public static void func (int num, int a)
	{
		int index=1;
		while(num != 0)
		{
			if(num%10 == a)
			{
				System.out.println(index);
			}
			index++;
			num/=10;
		}
	}

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		
		for (int i=1; i<=9; i++)
		{
			func(num, i);
		}
	}

}
