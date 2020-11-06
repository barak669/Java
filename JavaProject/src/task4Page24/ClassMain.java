package task4Page24;

import java.util.ArrayList;
import java.util.Scanner;

public class ClassMain {

	public static void search(ArrayList<Check> c, String ChNumber)
	{
		for (Check ch: c)
		{
			
			if (ch.getChNumber().equals(ChNumber))
			{
				System.out.println(ch);
			}
			else
			{
				System.out.println("No Check were found");
			}
		}
	}
	
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		ArrayList <Check> checkArray = new ArrayList<Check>();
		for (int i=0; i<2; i++)
		{
			System.out.println("enter check number");
			String ChNumber = input.nextLine();
			System.out.println("enter bank name");
			String Bname = input.nextLine();
			System.out.println("enter Deposit number");
			int DepNumber = input.nextInt();
			System.out.println("enter amount");
			Float amount = input.nextFloat();
			input.nextLine();
			checkArray.add(new Check(ChNumber, Bname, DepNumber, amount));
		}
		
		System.out.println("enter check number to search");
		String ChNumber = input.nextLine();
		System.out.println("enter bank name to search");
		String Bname = input.nextLine();
		System.out.println("enter Deposit number to search");
		int DepNumber = input.nextInt();
		System.out.println("enter amount to search");
		Float amount = input.nextFloat();
		input.nextLine();
		for (Check c:checkArray)
		{
			search (c,ChNumber,Bname, DepNumber, amount);
		}
		
	}

	private static void search(Check c, String chNumber, String bname, int depNumber, Float amount) {
		
		
	}
}
