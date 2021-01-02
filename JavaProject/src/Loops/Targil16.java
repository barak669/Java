package Loops;
import java.util.ArrayList;
import java.util.Scanner;

public class Targil16 {



	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		int num;
		int temp = 0;

		do {
			System.out.println("enter number");
			num = input.nextInt();
			arr.add(num);
				
		}while(num!=999);
		
		for (int i=0; i<arr.size(); i++)
		{
			
			if( arr.get(i) < 999)
			{
				temp = arr.get(i);
			}
			else if (arr.get(i+1) > arr.get(i))
			{
				temp = arr.get(i+1);
			}
		}
	}
}
