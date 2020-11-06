package Array121020;
import java.util.ArrayList;
import java.util.Scanner;


public class ClassArray27 {

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
		
		private static boolean func(ArrayList<Integer> arr) {
			for (int i=0; i<arr.size(); i++)
			{
				if(i%2 == 0 && arr.get(i)%2 !=0 || i%2 != 0 && arr.get(i)%2 ==0 )
				{
					return false;
				}
			}
			return true;
		
	}

}
