package WhileLoop041020;

import java.util.Scanner;

public class ClassMain2 {

	public static void main(String[] args) {
		
		int a, b, temp, count=0;
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("enter number");
		a = input.nextInt();
		
		System.out.println("enter number");
		b = input.nextInt();
		
		while(a!=0)
		{
			temp = b;
		
			while(temp != 0)
			{
				if (a%10 == temp%10)
				{
					System.out.println(a&10);
					count++;
				}
				temp/=10;
			}
			a/=10;
		}
		System.out.println(count);
	}

}

// סיבוכיות היא o(n^2)
//לולאה בתוך לולאה
