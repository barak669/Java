package Threat;

public class SecThread implements Runnable{
	private String name;
	private static String[] arr = new String[20];
	private static int i=0;
	
	public SecThread(String name)
	{
		this.name = name;
	}
	
	public void run()
	{
		System.out.println("start" + Thread.currentThread().getName());
		
		for (int j=0; j<4; j++)
		{
			addPlace(name, j);
		}
		
		System.out.println("end" + Thread.currentThread().getName());;
	}
	
	public static synchronized void addPlace (String Secname, int nameP)
	{
		arr[i] = Secname +" "+ nameP;
		i++;
	}
	
	public static void print()
	{
		for (int i =0; i<20; i++)
		{
			System.out.println(arr[i]);
		}
	}

}
