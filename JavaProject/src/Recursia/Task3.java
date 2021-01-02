package Recursia;

import java.util.Scanner;

public class Task3 {

	private static int sum_digits(int num) {
		
		if(num <= 0) {
			return 0;
		}
		if(num > 0) {
			return num%10 + sum_digits(num/10);
		}
		return num;
	}

	public static void main(String[] args) {

	    int num = 356693;

		int sum = sum_digits(num);
		System.out.println(sum);

	}

}
