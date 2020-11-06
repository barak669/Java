package ExerciseBooklet;

public class Qustion3Part1andPar2 {
	
	
	public static int what(int num)
	{
		int c = 0;
		while (num > 0 ) 
		{
			c += (num % 2);
			num /= 10;
							
		}
		return c;

	}
	
	public static void why()
	{
		int[] arr = {12345, 34781, 23, 468, 139};
		int res = arr [0];
		
		for (int i=0; i<arr.length; i++)
		{
			if (what(arr[i]) < what(res))
			{
				res = arr[i];
			}
		}
		System.out.println(res);
	}

	public static void main(String[] args) {
		
		int num = 43876986;
		why();
		
		
		

}
}

//שאלה 3 חלק א 
//1 - יחזיר כמה מספרים אי זוגיים יש
//2 - 2
//3 - מחשבת כמה מספרים אי זוגיים יש

//שאלה 3 חלק ב
//בודק אם המספר שהוכנס הוא זוגי

