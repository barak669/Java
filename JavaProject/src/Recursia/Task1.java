package Recursia;

import java.util.Scanner;

public class Task1 {
	
	private static int func(int num[],int size) {
		
		if(size ==0) {
			return 0;
		}
		if(num[size-1] %2 == 0) {
			return num[size-1] +func (num,size-1);
		}
		else {
			return 0 + func(num, size-1);
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter size of array  : ");
	    int a = input.nextInt();
	    int[] num = new int[a];
	    
        for(int i = 0; i < a; i++)
        {
       	 	System.out.println("Element number at index" +" "+ i);
       	 	num[i] = input.nextInt();
        }
        int len = num.length;
		
		int sum = func(num,len);
		System.out.println(sum);

	}

	

}
