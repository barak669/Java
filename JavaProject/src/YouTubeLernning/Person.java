package YouTubeLernning;

public class Person {
	
	private int height;
	private String id;
	private Car car;
	
	public Person() {
		this.height = 175;
		this.id = "000000000";
		this.car = new Car();
	}

	public Person(int height, String id, Car c) {
		this.height = height;
		this.id = id + "";
		this.car = new Car(1000, 5, 350, "Blue", "KIA");
	}
	
	public Car getCar() {
		return this.car;
	}

}
