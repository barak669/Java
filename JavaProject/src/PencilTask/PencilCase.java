package PencilTask;

import java.util.ArrayList;

public class PencilCase {

	private ArrayList<Pencil> arr;

	public PencilCase() {
		
		arr = new ArrayList<Pencil>();
		
	}
	public void addPencil(String model , double length  )
	{
		arr.add(new Pencil ( length , model));
	}
	public void addPencil(String model , double length , String color )
	{
		arr.add(new ColorPencil(length, model, color));
	}
	public void sharpenByColor(String color, double x)
	{
		for ( Pencil p : arr)
		{
			if( p instanceof ColorPencil )
			{
				if(((ColorPencil) p).getColor().equals(color))
					p.sharpen(x);	
			}
		}
	}
}