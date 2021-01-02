package Loops;
import java.util.Scanner;
public class Targil6 {

	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	
		
		for (int i=10; i<99; i++)
		{
			int num = i;
            int tens = num/10;
            int ones = num%10;
			if ( (tens == 5) || (ones == 5) )
			{
				System.out.println(num);
			}
		}
	

		

	}

}
