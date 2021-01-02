package Task14012020.Task9;

public class Room extends Guest{
	
	private int numOfBeds;
	private Guest[] allGuests;
	
	
	public int getNumOfBeds() {
		return numOfBeds;
	}
	
	public void setNumOfBeds(int numOfBeds) {
		this.numOfBeds = numOfBeds;
	}

	public Guest[] getAllGuests() {
		return allGuests;
	}

	public void setAllGuests(Guest[] allGuests) {
		this.allGuests = allGuests;
	}

	public Room(String name, int passportNumber, int numOfBeds, Guest[] allGuests) {
		super(name, passportNumber);
		this.numOfBeds = numOfBeds;
		this.allGuests = allGuests;
	}
	

}
