package Classs;

import interfaces.Ireptile;

public class Reptile extends Animal implements Ireptile{

	private boolean poision;

	public Reptile(String name, int id, boolean poision) {
		super(name, id);
		this.poision = poision;
	}

	@Override
	public boolean getPosion() {
	
		return false;
	}
	
	
}
