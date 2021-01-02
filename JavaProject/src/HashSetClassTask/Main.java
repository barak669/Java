package HashSetClassTask;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		HashMap<Integer, Car> arr = new HashMap<Integer, Car>();
		Scanner input = new Scanner(System.in);
		
		
		arr.put(3666174, new Car("3666174", "TOYOTA", "White"));
		arr.put(9949911, new Car("9949911", "KIA", "Gray"));
		arr.put(3666174, new Car("3666174", "TOYOTA", "White"));
		
		System.out.println("enter car number");
		int pn = input.nextInt();
		
		System.out.println(arr.get(pn));
		

	}

}
