package ThreadHomeWork;
import java.util.ArrayList; 
import java.util.List; 
import java.util.Random; 

public class SecThread implements Runnable{
	private String name;
	private static String[][] mat = new String[5][5];
	private static int i=0;
	private static int j=0;
	
	public SecThread(String name)
	{
		super();
		this.name = name;
	}
	
	public void run()
	{		
		for (int z=0; z<5; z++)
		{
			while ( addPlace(name, z) == false);	
		}
	}
	
	private static synchronized boolean addPlace (String name2, int z)
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
				System.out.print(mat[z][t] + "          ");
			}
			System.out.println();
		}
	}
}
