import java.awt.Color;

public class Dog {
	
	String name;
	int id;
	Color color;
	
	
	
	public Dog (int i)
	{
		id=i;
	}
	
	
	
	String getName()
	{
		return name;
	}
	
	int getId()
	{
		return id;
	}
	
	Color getColor()
	{
		return color;
	}
	
	void setName (String n)
	{
		name = n;
	}
	
	void setColor (Color c)
	{
		color = c;
	}

}
