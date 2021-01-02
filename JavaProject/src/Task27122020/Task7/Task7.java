package Task27122020.Task7;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Task7 {
	
	public static ArrayList<Integer> func (String str)
	{
		int counter=0;
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		for (int i=0; i<str.length(); i++)
		{
			if(str.charAt(i) == '!' || str.charAt(i) == '.')
				{
						arr.add(counter);
						counter=0;
						i++;
						while (i<str.length() && str.charAt(i) == ' ') i++;
				}
			counter++;
		}
		return arr;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		ArrayList<Integer> arr;
		System.out.println("enter your string");
		String str = input.nextLine();
		
		arr = func(str);
		for (int i=0; i<arr.size(); i++)
		{
			System.out.println(arr.get(i));

		}

	}

}
