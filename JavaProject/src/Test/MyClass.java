package Test;
import java.util.ArrayList;
import java.util.Collections;  // Import the Collections class

public class MyClass {

	public static void main(String[] args) {
	
		    ArrayList<Integer> myNumbers = new ArrayList<Integer>();
		    myNumbers.add(33);
		    myNumbers.add(15);
		    myNumbers.add(20);
		    myNumbers.add(34);
		    myNumbers.add(8);
		    myNumbers.add(12);
		    String txt = "Please locate where 'locate' occurs!";
		    System.out.println(txt.indexOf("loca")); // Outputs 7


		    Collections.sort(myNumbers);  // Sort myNumbers

		    for (int i : myNumbers) {
		      System.out.println(i);
		    }
		  }
		
	}
