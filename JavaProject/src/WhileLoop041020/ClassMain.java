package WhileLoop041020;

import java.util.Scanner;

public class ClassMain {

	public static void main(String[] args) {
		
		int num, sum=0;
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("enter number");
		num = input.nextInt();
		
		while(num!=0)
		{
			if ((num%10) %2 == 0) {
				sum += num%10;
				num/=10;
			}
		}
		
		System.out.println(sum);
	}

}
