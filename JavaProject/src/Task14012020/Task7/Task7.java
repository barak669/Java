package Task14012020.Task7;

import java.util.Scanner;

public class Task7 {
	
	public static void switchLetters(StringBuilder str, int indexBegin, int indexEnd)
	{
		
	}

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StringBuilder str = new StringBuilder();
        
        System.out.println("Enter your string: ");
        String word = input.nextLine();
        str = word;
        
        System.out.println("Enter the Begin index: ");
        int indexBegin = input.nextInt();
        
        System.out.println("Enter the End index: ");
        int indexEnd = input.nextInt();
		
		switchLetters(str, indexBegin, indexEnd);

	}

}
