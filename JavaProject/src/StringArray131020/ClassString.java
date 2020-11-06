package StringArray131020;

import java.util.Scanner;

public class ClassString {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int countBig=0, countS=0, countWord=0;
		String str = input.nextLine();
		
		String[] arr = str.split(" ");
		
		for (int i=0; i<arr.length; i++)
		{
			for (int j=0; i<arr[i].length(); j++) 
			{
				if (arr[i].charAt(j) >= 'a' && arr[i].charAt(j) <= 'z') 
				{
					countS++;
				}
				
				if (arr[i].charAt(j) >= 'A' && arr[i].charAt(j) <= 'Z') 
				{
					countBig++;
				}
			}
			
			if (countBig > countS)
			{
				countWord++;
			}
			
			countS=0;
			countBig=0;
		}
	}
}
