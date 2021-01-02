package Targilim2;
import java.util.Scanner;
public class Targil16 {
	
	public static void myfunc(int arr[])
	{
		if( arr[0] == 0) {
			return;
		}
		int num = 0; 
		int sum = 0;
		
		for (int i=0; i<arr.length; i++) {
			num = arr[i];
			sum = (num %10) + (num/10);
			arr[i] = sum;
		}
		
		for (int i=0; i<arr.length; i++) {
			if(arr[i] == arr[0]) {
				System.out.println(arr[i]);
			}
			else {
				System.out.println("Not Found!");
			}
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
			
		int[] arr = new int[10];
		for (int i=0; i<10; i++) {
			
			System.out.println("enter numbers!");
			arr[i] = input.nextInt();
			
			if(arr[0] <1 || arr[0] >27) {
				System.out.println("Worng number need to be between 1 to 27!!! ");
				arr[0] = 0;
				break;
			}
		}
		myfunc(arr);
	}
}
