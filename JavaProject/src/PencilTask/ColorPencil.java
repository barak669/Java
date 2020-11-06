package PencilTask;

public class ColorPencil extends Pencil {

	private String color;

	public ColorPencil(double length, String model, String color) {
		super(length, model);
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	
	@Override
	public String toString() {
		return "ColorPencil [Color=" + getColor() + ", Length=" + getLength() + ", Model=" + getModel()
				+ "]";
	}

	boolean isColor(String c)  
	{
		return c.equals(color);
	}
	
	public boolean equals ( Object obj)
	{
		
		if( obj instanceof Pencil)
		{
		ColorPencil p1 = ( ColorPencil ) obj;
		
		if( p1.getColor() == getColor() && p1.getModel().equals(getModel()) && p1.getLength() == getLength())
			return true; 
		}
		return false; 
		
	}
	
	
}

