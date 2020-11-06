package ExerciseBooklet;

import java.util.ArrayList;
import java.util.Scanner;

public class Qustion1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int[] arr = new int[200];
		int num = 0;
		
		
		
		for (int i=0; i<arr.length; i++) {
			
			System.out.println("enter number");
			if (arr[i] != 0) {
				arr[i] = input.nextInt();
			}
			else {
				break;
			}
			
	}
		
		System.out.println(arr.length);
		for (int i=0; i<arr.length; i++) {
			if (arr[i]%2 == 0) {
				num++;
			
		}
		System.out.println(num);
			
			
		
			
	}
		
	

	}

}
