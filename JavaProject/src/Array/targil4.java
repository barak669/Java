package Array;

import java.util.Scanner;

public class targil4 {

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		int negativCounter = 0;
		int positiveCounter = 0;
		int[] arr = new int[10];
		
		for (int i=0; i<arr.length; i++)
		{
			System.out.println("enter 10 numbers: ");
			arr[i] = input.nextInt();
		}
		
		for (int i=0; i<arr.length; i+=2)
		{
			System.out.println(arr[i]);
		}

	}
}
