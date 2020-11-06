package ForLoop051020;

public class ClassMain {

	public static void main(String[] args) {
		
		for (int i = 100; i<=999; i++)
		{
			if ( (i%10)%2 == 0 & ((i/10)%10)%2 == 1 && (i/100)%2 == 0)
				System.out.println(i);
		}
	}
}
