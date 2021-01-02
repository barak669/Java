package Task27122020.Task1;

import java.util.ArrayList;

public class EvenHallThreadPool implements Runnable{

	private String name;
	//private static String[] arr;
	//private static int i=0;
	//private static int j=0;
	
	public EvenHallThreadPool(String name)
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
		for (int i =0; i<5; i++) 
		{
			if (arr[i] == null) 
			{
				arr[i] =name2 +" "+ z;
				return true;
			}
			return false;
		}
	}
	
	public static void print()
	{
		for (int z =0; z<5; z++)
		{
			System.out.print(arr[z] + "          ");
			System.out.println();
		}
	}


}
