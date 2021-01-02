package Functions;
import java.util.Scanner;

public class Targil18X {
	
	public static void myFunc(int num)
	{
		
		String temp = Integer.toString(num);
		int[] arr = new int[temp.length()];
		System.out.println(arr.length);
		
		for (int i=0; i < arr.length; i++)
		{
			  arr[i] = 0;
		      arr[i] = temp.charAt(i);
		      System.out.println("arr[i]" +" "+ arr[i]);
		      System.out.println("temp.charAt(i)" +" "+ temp.charAt(i));
		}
		System.out.println(arr[3]);
		
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		 System.out.println("enter your number: ");
		 int num = input.nextInt();
		 
		 myFunc(num);

	}

}
