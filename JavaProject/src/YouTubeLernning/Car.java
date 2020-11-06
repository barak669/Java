package YouTubeLernning;

public class Car {
	
	public static int totalID = 0;
	
	private int price;
	private int id;
	private int numberOfSeats;
	private int maxSpeed;
	private String color;
	private String company;
	
	
	public Car() {
		totalID++;
		this.id = totalID;
		this.price = 500000;
		this.numberOfSeats = 5;
		this.maxSpeed = 300;
		this.color = "Black";
		this.company = "Volvo";
	}
	
	
	public Car(int price, int nos, int maxS, String color, String company) {
		totalID++;
		this.id = totalID;
		this.price = price;
		this.numberOfSeats = nos;
		this.maxSpeed = maxS;
		this.color = color;
		this.company = company;
	}

	public int getPrice() {
		return this.price;
	}
	

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public int getNumberOfSeats() {
		return this.numberOfSeats;
	}


	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}


	public int getMaxSpeed() {
		return this.maxSpeed;
	}


	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}


	public String getColor() {
		return this.color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public String getCompany() {
		return this.company;
	}


	public void setCompany(String company) {
		this.company = company;
	}
	
	
	public String toString() {
		return "Car [price=" + this.price + ", numberOfSeats=" + this.numberOfSeats + ", maxSpeed=" + this.maxSpeed + ", color="
				+ this.color + ", company=" + this.company + ", ID= " + this.id + "]";
	}
	
	
	
	
	

}
