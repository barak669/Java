package Task27122020.Task6;

import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number of rows");
		int rowCount = input.nextInt();
		
		System.out.println("Enter number of columns");
		int columnCount = input.nextInt();
		
		int[][] mat = new int[rowCount][columnCount];
		int r,c;
		
		System.out.println("Starting input of array elements...\n");
		for (int i = 0; i < rowCount; i++) {
			for (int j = 0; j < columnCount; j++) {
				System.out.println("Enter element of row " + (i + 1) + ", column " + (j + 1));
				mat[i][j] = input.nextInt();
			}
		}
		
		System.out.println("matrix is: ");
		
		for (r=0; r<rowCount; r++)
		{
			for(c=0; c<columnCount; c++)
			{
				System.out.print(mat[r][c] + " ");
			}
			System.out.println();
		}
		
		System.out.println("mirror is: ");
		
		for(r=0; r<rowCount; r++)
		{
			for (c=columnCount-1; c>=0; c--)
			{
				System.out.print(mat[r][c] + " ");
			}
			System.out.println();
		}
		

	}

}
