package Task14012020.Task6;

import java.util.Scanner;

public class Task6 {

		    public static boolean parity_equals(int number) {
		        return ((number % 10) % 2 == 0) == (((number % 100) / 10) % 2 == 0);
		    }
		    public static boolean changer(int number) {
		        if(number < 100) 
		        {
		        	return !parity_equals(number);
		        }
		        return parity_equals(number) ? false : changer(number / 10); // if parity is equal, returns false
		    }
		    
		    public static void main(String [] args) {
		        Scanner input = new Scanner(System.in);
		        System.out.println("Enter a number: ");
		        System.out.println(changer(input.nextInt()));
		    }
}
