import java.awt.Color;
import java.util.Scanner;

public class ClassMain {

	public static void main(String[] args)
	{
		Scanner input = new Scanner (System.in);
		Dog d1 = new Dog(1118);
		Dog d2 = new Dog(1119);
		
		d1.setName("bobi");
		d2.setColor(Color.DARK_GRAY);
		
		System.out.println(d1.getName());
		
		
		// String str = input.next();            //����� �� ������
		// String strL = input.nextLine();      //����� �� ���� ���� ������
		// int num = input.nextInt();          //����� �� ���� ���
		// double num1 = input.nextDouble();  //����� �� ���� ������
		
		System.out.println("enter first id");
		int id = input.nextInt();
		System.out.println("enter first name");
		String name = input.next();
		
		Dog dog1 = new Dog(id);
		dog1.setName(name);
		
		System.out.println("enter second id");
		int id1 = input.nextInt();
		System.out.println("enter second name");
		String name1 = input.next();
		
		Dog dog2 = new Dog(id1);
		dog2.setName(name1);
		
		if(dog1.getId() > dog2.getId())
			System.out.println(dog1.getName());
		else
			System.out.println(dog2.getName());
	}

}
