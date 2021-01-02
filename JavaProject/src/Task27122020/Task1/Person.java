package Task27122020.Task1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import ThreadTask.EventsHall;

public class Person 
{
	static Scanner input = new Scanner(System.in);
	
	private static int id;
	private int phoneNumber;
	private String address;

	public Person()
	{
		this.id = id;
		this.phoneNumber = phoneNumber;
		this.address = address;
	}
	
	public static void getInfo(Person p)
	{
		System.out.println("enter id");
		p.id = input.nextInt();
		
		System.out.println("enter phone number");
		p.phoneNumber = input.nextInt();
		
		System.out.println("enter address");
		p.address = input.next();
	}
	
	public String GetDescription()
	{
		return "Person ID: "+ id + "," + "Person phone number: " + phoneNumber + "," + "Person address: "+ address;
	}

	
	public static void main(String[] args)
	{
		
		ArrayList<Person> arr = new ArrayList<Person>();
		
		
		Person person1 = new Person();
		getInfo(person1);
		arr.add(person1);
		Thread p1 = new Thread((Runnable) person1);
		p1.start();
		
		
		Person person2 = new Person();
		getInfo(person2);
		arr.add(person2);
		Thread p2 = new Thread((Runnable) person2);
		p2.start();
		
		Person person3 = new Person();
		getInfo(person3);
		arr.add(person3);
		Thread p3 = new Thread((Runnable) person3);
		p3.start();
		/*do {
			Person p = new Person();
			System.out.println("enter persons");
			getInfo(p);
			if(p.id!=0)
			{
				arr.add(p);
			}
			
		}while(id!=0);
		*/
		
		for(int i=0; i<arr.size(); i++)
		{
			System.out.println(arr.get(i));
		}
		
		
		ExecutorService executeor = Executors.newFixedThreadPool(5);
		
		for(int i=0; i<100; i++)
		{
			Runnable worker = new EvenHallThreadPool(arr.get(i) + "");
			executeor.execute(worker);
		}
		
		executeor.shutdown();
		while(!executeor.isTerminated());
		
		EvenHallThreadPool.print();

	}

}
