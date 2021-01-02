package Loops;

public class Targil14 {

	public static void main(String[] args) {

		for (int i=100; i<999; i++)
		{
			if ( (i%10) == ((i/10)%10) )
			{
				System.out.println("first" +" "+ i);
			}
		}
		
		for (int j=100; j<999; j++)
		{
			if( (j/100) == ((j%10) + ((j/10)%10))) 
			{
				System.out.println("second" +" "+ j);
			}
		}
		
		for (int k=100; k<999; k++)
		{
			if((k/100) + (k%10) == 5 ) 
			{
				System.out.println("third" +" "+ k);
			}
		}

	}

}
