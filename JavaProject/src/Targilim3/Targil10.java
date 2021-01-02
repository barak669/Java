package Targilim3;

import java.util.Scanner;

public class Targil10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("enter number");
		int time = input.nextInt();
		
		int hours = time / 60;
		int minutes = time % 60;
		System.out.println(hours +" "+ "hours and" +" "+ minutes +" "+ "minutes" +" "+ "=]");
		System.out.println();
	}
}
