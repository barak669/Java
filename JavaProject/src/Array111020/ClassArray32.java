package Array111020;

import java.util.Scanner;

public class ClassArray32 {

public static void func(int[] a, int[] b) {
		
		double[] c = new double[a.length];
		
		for (int i=0; i<a.length; i++) 
		{	
			c[i] = (a[i] + b[i]) / 2.0; 
		}
		
		for (int i=0; i<c.length; i++)
		{
			System.out.println(c[i]);
		}
		
	}
public static void main(String[] args) {
	
	    int count=0;

		
		Scanner input = new Scanner(System.in);
		
		int[] arr = null;
		for (int i=0; i<10; i++) {
			
			System.out.println("enter number");
			arr[i] = input.nextInt();	
		}
		for(int i=0; i<10; i++) {
			
			if (Math.pow(i+1, 3)== arr[i]) {
				count++;
			}
		}
		System.out.println("result: " + count);
	}
}

