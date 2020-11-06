package Array111020;

import java.util.Scanner;

public class ClassArray15 {

	public static void main(String[] args) {
		
		int[] arr = new int[10];
		int count=0;
		
		Scanner input = new Scanner(System.in);
		
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
