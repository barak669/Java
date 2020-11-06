package Array121020;
import java.util.ArrayList;
import java.util.Scanner;


public class ClassArray33 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		int num=0;
		
		do {
			System.out.println("enter number");
			num = input.nextInt();
			if(num!=0)
			{
				arr.add(num);
			}
			
		}while(num!=0);
		
		func (arr);
	}
	
		private static void func(ArrayList<Integer> arr) {
			
			int num = arr.get(0) +arr.get(arr.size()-1);
			
			for (int i=0; i<arr.size()-1; i++)
			{
				arr.set(i, arr.get(i) + arr.get(i+1));
			}
			arr.set(arr.size()-1,  num);
			
			for(int i=0; i<arr.size(); i++)
			{
				System.out.println(arr.get(i));
			}
		}
		
}
