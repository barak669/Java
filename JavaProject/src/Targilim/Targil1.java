package Targilim;

import java.util.Scanner;

public class Targil1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int HourlyWage = 0;
		int WorkMonth = 0;
		int sum = 0;
		System.out.println("Please input your hourly wage: ");
		HourlyWage = input.nextInt();
		System.out.println("How many hours did you work? ");
		WorkMonth = input.nextInt();
		
		sum = HourlyWage * WorkMonth;
		System.out.println("gross salary: " + sum);

	}

}
