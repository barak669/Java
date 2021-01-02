package Targilim5;
import java.util.Scanner;
public class Targil10 {

	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	
		
		
		for (int i=100; i<999; i++)
		{
			if( (i%10) == (i/10)%10 )
			{
				System.out.println("first" +" "+ i);
			}
		}
		
		
		for (int j=100; j<999; j++)
		{
			if( (j/100) == ((j%10) + ((j/10)%10)) )
			{
				System.out.println("second" +" "+ j);
			}
		}
		
		for (int k=100; k<999; k++)
		{
			if ( (k%10) + (k/100) ==5 )
			{
				System.out.println("third" +" "+ k);
			}
		}
	}
}
