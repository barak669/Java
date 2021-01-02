package Targilim5;
import java.util.Scanner;
public class Targil8 {

	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		int[] score = new int[10];
		int gadol = 0;
		int katan = 0;
		
		
		for (int i=0; i<score.length; i++)
		{
			System.out.println("enter your score");
			score[i] = input.nextInt();
			
			if(score[i] >=90)
			{
				gadol++;
			}
			else if (score[i] <=55)
			{
				katan++;
			}
		}
		System.out.println("the number of score that biger then 90: " + gadol);
		System.out.println("the number of score that lower then 55: " + katan);
	

		

	}

}
