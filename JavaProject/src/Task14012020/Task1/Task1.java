package Task14012020.Task1;
import java.util.Scanner;

public class Task1 {
	
	public static boolean rowsAndColumsSum(int mat[][], int row, int col)
	   {
			int rowSum = 0;
			int colSum = 0;
			
			for (int a=0; a < row; a++) 
			{
			    for(int r = 0; r < row; r++)
			    {
			    	rowSum += mat[r][a];
			    }
			}
			    for(int r = 0; r < row; r++)
			    {
				    for(int c = 0; c < col; c++)
				    {
				    	colSum += mat[r][c];
				    }
			    }

		    if(rowSum == colSum)
		    {
		    	return true;
		    }
		    else
		    	return false;
	   }
	
	

	public static void main(String args) {
		Scanner input = new Scanner(System.in);
		
		 System.out.println("Please enter size of matrix  : ");
	      int row = input.nextInt();
	      int col = row;
	      int[][] matrix = new int[row][col];
	      
	      System.out.println("Please enter elements in matrix : ");
	      for(int r = 0; r < row; r++)
	      {
	    	 System.out.println("Enter numbers in row" +" "+ r); 
	         for(int c = 0; c < col; c++)
	         {
	        	 System.out.println("Element number at index" +" "+ c);
	        	 matrix[r][c] = input.nextInt();
	         }
	      }
	      
	      System.out.println("Printing matrix : ");
	      for(int a = 0; a < row; a++)
	      {
	         for(int b = 0; b < col; b++)
	         {
	            System.out.print(matrix[a][b] + "\t");
	         }
	         System.out.println();
	      }
	      
	      boolean checkMat = rowsAndColumsSum(matrix,row,col);
	      System.out.println(checkMat);
	}

}
