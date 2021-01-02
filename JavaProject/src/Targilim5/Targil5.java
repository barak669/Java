package Targilim5;
import java.util.Scanner;
public class Targil5 {

	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	
		
		for (int i=100; i<999; i++)
		{
			int num = i;
			int hundreds = num/100;
            int tens = (num/10)%10;
            int ones = num%10;
			if ( (tens < ones) && (hundreds > tens) )
			{
				System.out.println(num);
			}
		}
	

		

	}

}
