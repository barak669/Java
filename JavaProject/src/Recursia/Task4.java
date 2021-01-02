package Recursia;

public class Task4 {
	
	private static int find_max_sum_digits(int arr[],int size, int full_size)
	{
		if(full_size==0) {System.out.println(arr[size-1]); return size-1;}
		if(find_max_sum_digits(arr[size-1],size,full_size) < find_max_sum_digits(arr[full_size-1], size, full_size))
		{
			size=full_size;
		}
		return find_max_sum_digits(arr,size,full_size-1);
		
		return 0;
	}

	public static void main(String[] args) {
		
		int[] arr = {45,67,89,12,34};
		int size = 5;
		int full_size = 5;
		
		int sum = find_max_sum_digits(arr,size,full_size);
		System.out.println(sum);

	}

}
