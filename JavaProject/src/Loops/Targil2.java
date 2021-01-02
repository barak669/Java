package Loops;
import java.lang.Math;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Targil2 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int sum = 0;
		int temp = 0;
		
		
		for (int i=100; i<999; i++)
		{
			sum = 0;
			int num = i;
			
			while(num != 0)
			{
				temp = num%10;
				sum +=(int)Math.pow(temp, 3);
				num = num / 10;
			}
			if (sum == i)
			{
				System.out.println(sum +" "+ "IS A GOOD NUMBER!");
			}
	
	    }
	}

}
