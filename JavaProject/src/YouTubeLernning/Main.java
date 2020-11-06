package YouTubeLernning;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		Car c1 = new Car();
		Person p1 = new Person(180, "123456789", c1);
		c1.setMaxSpeed(600);
		System.out.println(p1.getCar().getMaxSpeed());
		


		
		
		
		
		
		
		
		
		
		in.close();


	}

}
