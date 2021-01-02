package Array;
import java.util.Scanner;
public class Targil2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int negativCounter = 0;
		int positiveCounter = 0;
		int[] arr = new int[20];
		
		for (int i=0; i<arr.length; i++)
		{
			System.out.println("enter 20 numbers: ");
			arr[i] = input.nextInt();
		}
		
		for (int i=0; i<arr.length; i++)
		{
			if(arr[i] > 0)
			{
				positiveCounter++;
			}
			else
			{
				negativCounter++;
			}	
		}
		System.out.println("positive number" + positiveCounter);
		System.out.println("negativ number" + negativCounter);
	}
}
