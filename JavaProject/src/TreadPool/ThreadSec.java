package TreadPool;
import java.util.ArrayList; 
import java.util.List; 
import java.util.Random; 

public class ThreadSec implements Runnable{
	private String name;
	private static String[][] mat = new String[5][5];
	
	public ThreadSec(String name)
	{
		super();
		this.name = name;
	}
	
	public void run()
	{		
		while ( !addPlace(Thread.currentThread().getName(), name) );	
	}
	
	private static synchronized boolean addPlace (String name2, String z)
	{
		int i = (int) (Math.random() *5);
		int j = (int) (Math.random() *5);
		if (mat[i][j] == null) 
		{
			mat[i][j] =name2 +" "+ z;
			return true;
		}
		return false;

	}
	
	public static void print()
	{
		for (int z =0; z<5; z++)
		{
			for (int t =0; t<5; t++)
			{
				System.out.println(mat[z][t] + "          ");
			}
			System.out.println();
		}
	}
}
