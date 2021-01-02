package Functions;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Targil6 {
	
	public static void myFunc(int[] num)
	{
		Arrays.sort(num);
		for(int i=0; i<num.length; i++)
		{
			System.out.println(num[i]);
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int[] num = new int[10];	
		for(int i=0; i<10; i++)
		{
			System.out.println("enter your number: ");
			num[i] = input.nextInt();
		}
		
		myFunc(num);
	}

}
