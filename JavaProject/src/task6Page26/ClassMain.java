package task6Page26;
import java.util.ArrayList;
import java.util.Scanner;



public class ClassMain {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		ArrayList<Toy> arr = new ArrayList<Toy>();
		
		for (int i=0; i< 8; i++)
		{
			System.out.println("enter code");
			int code = input.nextInt();
			input.nextLine();
			
			System.out.println("enter group");
			String group = input.nextLine();
			
			System.out.println("enter manufact");
			String manufact = input.nextLine();
			
			System.out.println("enter year");
			int year = input.nextInt();
			input.nextLine();
		}

	}
	
	

}
