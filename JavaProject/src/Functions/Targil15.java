package Functions;
import java.util.Scanner;

public class Targil15 {
	
	public static void countSum(int num)
	{
		int temp = num;
		int sum1 = 0;
		int sum2 = 0;
		int counter = 0;
		
		while(num != 0)
		{
			sum1 += num%10;
			num/=10;
		}
		num = temp;
		//return sum1;
		
		for(int i=1; i<num; i++)
		{
			temp = i;
			while(i != 0)
			{
				sum2 += i%10;
				i/=10;
			}
			i = temp;
			if (sum1 == sum2)
			{
				counter++;
				System.out.printf("The number %d is smaller then your num but with the same sum%n" ,i);
			}
			sum2 = 0;
		}
		System.out.println("The amount numbers are smaller then your num but with the same sum is: " + counter);
	}

	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		 System.out.println("enter your number: ");
		 int num = input.nextInt();

		 
		 /*int sum1 = countSum(num);
		 System.out.println("the sum of all of your number is: " + sum1); 
		 */
		 
		 countSum(num);
	}

}
