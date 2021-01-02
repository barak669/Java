package Task14012020.Task2;

public class Task2 {

	static boolean isKaprekar(int n) 
    { 
        int squared = n * n; 
        int count_digits = 0; 
        while (squared != 0) 
        { 
            count_digits++; 
            squared /= 10; 
        } 
       
        squared = n*n; 
       
   
        for (int digits=1; digits<count_digits; digits++) 
        { 
             int n_parts = (int) Math.pow(10, digits); 

             if (n_parts == n) 
                continue; 

             int sum = squared/n_parts + squared % n_parts; 
             if (sum == n) 
               return true; 
        } 
       
        
        return false; 
    } 
      
    
    public static void main (String[] args) 
    { 
        System.out.println("The first 20 'KAPREKAR Numbers'"); 
          
        for (int i=9; i<1000000; i++) 
            if (isKaprekar(i)) 
                 System.out.println(i + " "); 
    } 
} 
