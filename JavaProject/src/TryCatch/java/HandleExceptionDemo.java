package TryCatch.java;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HandleExceptionDemo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean contineInput = true;
		
		do {
			try {
				System.out.println("enter number: ");
				int number = scanner.nextInt();
				
				System.out.println("you enter: " + number);
				
				contineInput = false;
			}
			catch (InputMismatchException ex) {
				System.out.println("Try again.");
				scanner.nextLine();
			}
		}while (contineInput);

	}

}
