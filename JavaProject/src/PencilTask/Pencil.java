package PencilTask;

public class Pencil {
	
	private double length;
	private String model;
	
	public Pencil(double length, String model) {
		
		setLength(length);
		this.model = model;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		
		if( length <= 0 )
			System.out.println("error");
		else
			this.length = length;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	
	void sharpen(double x)
	{
		if ( length - x < 0)
			length = 0;
		else
			length -= x; 
	}
	
	public boolean equals ( Object obj)
	{
		
		if( obj instanceof Pencil)
		{
		Pencil p1 = ( Pencil ) obj;
		
		if( p1.getModel().equals(model) && p1.getLength() == length)
			return true; 
		}
		return false; 
		
	}

}