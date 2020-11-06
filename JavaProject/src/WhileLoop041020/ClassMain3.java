package WhileLoop041020;

import java.util.Scanner;

public class ClassMain3 {

	public static void main(String[] args) {
		
		int a, b, temp=1, sum=0, count=0;
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("enter number");
		a = input.nextInt();
		
		System.out.println("enter number");
		b = input.nextInt();
		
		while (a != 0 ) 
		{
			if (b < a%10 && b > (a/10)%10 )
			{
				sum += (a%10)*temp;
				temp *= 10;
				sum += b *temp;
			}
			else {
				sum += (a%10) *temp;
			}
			temp*=10;
			a/=10;
		}
		System.out.println(sum);
		
		input.close();
		
	}
}