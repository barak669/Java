package task5Page25;

import java.util.ArrayList;
import java.util.Scanner;

public class ClassMain {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		ArrayList<Film> arr = new ArrayList<Film>();
		
		for (int i=0; i< 15; i++)
		{
			System.out.println("enter name");
			String name = input.nextLine();
			
			System.out.println("enter director");
			String director = input.nextLine();
			
			System.out.println("enter director");
			int copies = input.nextInt();
			input.nextLine();
		}
}
}