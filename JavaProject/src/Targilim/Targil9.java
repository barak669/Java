package Targilim;
import java.util.Scanner;
import java.util.Scanner;

public class Targil9 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int salary = 0;
		int sum = 0;
		System.out.println("Please input your salary: ");
		salary = input.nextInt();
		
		if(salary > 5000)
		{
			sum = (salary*18)/100;
			salary = salary - sum;
		}
		else
		{
			sum = (salary*10)/100;
			salary = salary - sum;
		}
		System.out.println("Your salary is: " + salary);
	}
}
