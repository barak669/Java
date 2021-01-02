package SundayPractice;

public class TaskQ3 {
	
	public static int[] maxSeq(int[]arr, int size) {
		int newarr[]= new int[3];
		int sum = 0, index=0, count=0;
		for (int i = 0; i < arr.length; i++) {
			
			if(arr[i]*(-1)>sum) {
				//System.out.println(sum+ " " +i);
				sum=0;
				index=i;
				count=0;
			}
			sum +=arr[i];
			count++;
		}
		//System.out.println(index+" "+ count+" " +sum);
		newarr[0]= index;
		newarr[1]= count;
		newarr[2]= sum; 
		
		return newarr;
	}

	public static void main(String[] args) {
		int [] arr = {1,2,3,4,-11,5,6,7,8,9};
		
		int[] res = maxSeq(arr, arr.length);
		for (int i = 0; i < res.length; i++) {
			System.out.print(res[i] +" ");
		}
	}

}

