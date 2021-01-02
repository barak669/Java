package Targilim4;
import java.util.Scanner;
import java.lang.Math; 
public class Targil24switchCase {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("enter first numbr: ");
		int num1 = input.nextInt();
		
		System.out.println("enter second numbr: ");
		int num2 = input.nextInt();
		
		System.out.println("enter your option: add, sum, div, mul, power ");
		String option = input.next();
		
		switch (option) {
		case "add":
			System.out.println(String.valueOf(num1) + String.valueOf(num2));
			break;
			
		case "sum":
			System.out.println(num1 + num2);
			break;
			
		case "div":
			System.out.println(num1 / num2);
			break;
			
		case "mul":
			System.out.println(num1 * num2);
			break;
		
		case "power":
			System.out.println(Math.pow(num1, num2));
		}


	}

}
