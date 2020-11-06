package Classes;

import Interfaces.Ireptile;

public class Reptile extends Animal implements Ireptile{
	
	protected boolean poision;
	
	public Reptile(String name, int id, boolean poision) {
		super(name, id);
		this.poision = poision;
		
	}

	@Override
	public boolean getPosion() {
		return false;
	}

}
