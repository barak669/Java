package Task27122020.Task2;

import java.util.Scanner;

public class SplitNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
 
		String num;
		int digits;
		String[] newNum;
		System.out.println("enter your number: ");
		num = input.next();
		
		System.out.println("enter your digits: ");
		digits = input.nextInt();
		newNum = num.split("(?<=\\G.{"+digits+"})");

        //System.out.println(newNum[1]);
		
		for(int i = 0; i <newNum.length; i++) 
		{
			System.out.print(newNum[i]+"|");
		}
	}

}
