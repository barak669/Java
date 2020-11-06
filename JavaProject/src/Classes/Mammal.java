package Classes;

import Interfaces.Imammal;

public class Mammal extends Animal implements Imammal{
	
	private int dayOfBirth;
	

	public Mammal(String name, int id, int dayOfBirth) {
		super(name, id);
		this.dayOfBirth = dayOfBirth;
		
	}


	@Override
	public int getdayOfBirth() {
		return dayOfBirth;
	}

}
