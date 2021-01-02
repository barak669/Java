package Classs;

import interfaces.Imammal;
import interfaces.Ireptile;

public class ReptileMammal extends Animal implements Ireptile , Imammal {

	private Mammal m;
	private Reptile r; 
	
	public ReptileMammal( String name, int id, int dayOfBirth ,boolean poision)
	{
		super(name , id);
		m = new Mammal( name, id , dayOfBirth);
		r = new Reptile( name , id , poision);
		
		
	}

	@Override
	public int getdayOfBirth() {
		
		return m.getdayOfBirth();
	}

	@Override
	public boolean getPosion() {
		
		return r.getPosion();
	}
	
}
