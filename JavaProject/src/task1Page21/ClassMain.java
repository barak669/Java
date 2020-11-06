package task1Page21;
import java.util.Scanner;
import java.util.ArrayList;


public class ClassMain {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		ArrayList<Hotel> HotelsAr = new ArrayList<Hotel>();
		
		for (int i=0; i<30; i++)
		{
			System.out.println("enter name");
			String name = input.nextLine();
			
			System.out.println("enter city");
			String city = input.nextLine();
			
			System.out.println("enter free");
			int free = input.nextInt();
			
			System.out.println("enter rooms");
			int rooms = input.nextInt();
			
			HotelsAr.add(new Hotel (name,city,free,rooms));
			
		}
		
		
		System.out.println("enter city");
		String city = input.nextLine();
			
		for (Hotel i : HotelsAr)
		{
			if (i.getCity().equals(city))
				i.getCity();
		}
	}
}


