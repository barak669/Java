package Task27122020.Task4;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] arr = new String[4];
		int a;
		
		for(int i=0; i<4; i++)
		{
			System.out.println("enter a number between 0-10");
			arr[i] = input.next();
		}
		
		for(int i=0; i<4; i++)
		{
			a = "*" + arr[i];
		}
		
		 

	}

}
