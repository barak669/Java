package substring;

public class sub {

	public static void main(String[] args) {
		String str = "abcdefghij";
		
		for(int i=str.length(); i<=str.length(); i--)
		{
			if(i<0)
			{
				break;
			}
			String split = str.substring(0, i);
			System.out.println(split);
		}
		
	}

}
