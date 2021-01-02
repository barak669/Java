package Task14012020.Task9;

import java.util.Random;

public class Hotel extends Room{
	
	private int numOfUsedRooms;
	private Room[][] allRooms;
	
	Random rand = new Random(); 
    int rand1 = rand.nextInt(4); 
	
	public int getNumOfUsedRooms() {
		return numOfUsedRooms;
	}
	
	public void setNumOfUsedRooms(int numOfUsedRooms) {
		this.numOfUsedRooms = numOfUsedRooms;
	}
	
	public Room[][] getAllRooms() {
		return allRooms;
	}
	
	public void setAllRooms(Room[][] allRooms) {
		this.allRooms = allRooms;
	}

	public Hotel(String name, int passportNumber, int numOfBeds, Guest[] allGuests, int numOfUsedRooms, Room[][] allRooms) {
		super(name, passportNumber, numOfBeds, allGuests);
		this.numOfUsedRooms = numOfUsedRooms;
		this.allRooms = allRooms;
		
		for(int f=0; f<10; f++)
		{
			for(int r=1; r<100; r++)
			{
				setNumOfBeds(rand1);
			}
		}
	}
	
}
