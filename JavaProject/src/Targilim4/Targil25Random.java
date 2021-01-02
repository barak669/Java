package Targilim4;
import java.util.Random;
import java.util.Scanner;

public class Targil25Random {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Random rnd = new Random();
		int rnum;
		rnum = rnd.nextInt(9);
		
		System.out.println("Let's play a game..... enter a number between 1 to 9 ");
		int num = input.nextInt();
		
		if (rnum == num) {
			System.out.println("congratulations! you can go...");
		}
		else {
			System.out.println("GAME OVER!....");
		}
		

	}

}
