package Task27122020.Task5;

import java.util.ArrayList;
import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int[] arr  = new int[6];
		int c =1;
		int counter =0;
		
		for (int i=0; i<6; i++) 
		{
			System.out.println("enter number");
			arr[i] = input.nextInt();	
		}
		
		for (int j=0; j<arr.length; j++)
		{	
			if(arr[j] > 100 && arr[arr.length - c] > 100  ) 
			{
				if(arr[j]%10 == arr[arr.length - c]/100 && (arr[j]/10)%10 == (arr[arr.length - c]/10)%10 && arr[j]/100 == arr[arr.length - c]%10)
				{
					counter++;
				}
				else 
				{
					break;
				}
			}
			if(arr[j] < 100 && arr[arr.length - c] < 100  ) 
			{
				if(arr[j]%10 == arr[arr.length - c]/10 && arr[j]/10 == arr[arr.length - c]%10 )
				{
					counter++;
				}
				else 
				{
					break;
				}
			}
			c++;
		}
		
		if(counter == arr.length)
		{
			System.out.println("it is mirror array");
		}
		
		else {System.out.println("worng!!!");}

	}

}
