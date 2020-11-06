package Function;

import java.util.Scanner;

public class ClassMain {

		public static int func (int num)
		{
			int sum = 0;
			
			while(num != 0)
			{
				sum += num%10;
				num/=10;
			}
			return sum;
		}
		
		
		public static void main(String[] args) {
			
			Scanner input = new Scanner(System.in);
			int num = input.nextInt();
			
			for (int i=1; i<num; i++)
			{
				if (func(i) == func(num))
				{
					System.out.println(num);
				}
			}
			
		}

}
