package Targilim3;
import java.util.Scanner;
public class Targil5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int[] arr = new int[4];
		for (int i=0; i<4; i++) {
			
			System.out.println("enter numbers!");
			arr[i] = input.nextInt();
		}
		
		int sum = 0;
		int sub = 0;
		int mul = 0;
		int div = 0;
		
		sum = arr[0] + arr[2];
		sub = arr[1] - arr[3];
		div = arr[2] / 8;
		mul = arr[3] * arr[0];
		
		System.out.println("sum;" + sum + "sub" + sub + "mul" + mul + "div" + div);
		
	}

}
