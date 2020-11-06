package Array111020;

import java.util.Scanner;

public class ClassArray35 {

	public static void main(String[] args) {
		
		int[] arr = new int[20];
		int count=0, num, ileft=0, iright=0;
		
		Scanner input = new Scanner(System.in);
		
		for (int i=0; i<20; i++) {
			
			System.out.println("enter number");
			arr[i] = input.nextInt();
	}
		
		num = input.nextInt();
		for(int i=0; i<arr.length; i++)
		{
			if( arr[i] == num)
			{
				ileft = i;
				break;
			}
		}
		
		for (int i=arr.length; i>=0; i--)
		{
			if( arr[i] == num)
			{
				iright = i;
				break;
			}
		}
		
		for (int i=ileft+1; i<iright; i++)
		{
			System.out.println(arr[i]);
		}

}
}
