package Functions;

import java.util.Scanner;

public class Targil4 {
	
	public static void copies(String ch, int n)
	{
        for (int i=0; i<n; i+=2) 
        { 
            for (int j=n-i; j>1; j--) 
            { 
                System.out.print(" "); 
            } 
   
            for (int j=0; j<=i; j++ ) 
            { 
                System.out.print(ch+" "); 
            } 
   
            System.out.println(); 
        } 
    } 


	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n;
		String ch;
		
		System.out.println("enter your char");
		ch = input.next();
		
		do{
			System.out.println("enter odd number");
			n = input.nextInt();
		}while(n%2 == 0);
		
		copies(ch,n);

	}

}
