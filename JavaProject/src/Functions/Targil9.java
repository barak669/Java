package Functions;

public class Targil9 {
	
	public static void myFunc()
	{
		int counter = 0;
		for(int i=100; i<1000; i++)
		{
			if( i%10 != ((i/10)%10) && i%10 != (i/100) && (i/100) != ((i/10)%10) )
			{
				counter++;
				System.out.println(i);
			}
		}
		System.out.println("The amount of numbers is: " + counter);
	}

	public static void main(String[] args) {
		
		myFunc();

	}

}
