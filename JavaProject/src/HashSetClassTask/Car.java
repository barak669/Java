package HashSetClassTask;

public class Car {
	
	private String licenceNumber;
	private String model;
	private String color;
	
	
	public Car(String licenceNumber, String model, String color) {
		this.licenceNumber = licenceNumber;
		this.model = model;
		this.color = color;
	

	}

	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + ((licenceNumber == null) ? 0 : licenceNumber.hashCode());
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		return result;
	}

	

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Car)
		{
			Car c = (Car) obj;
			if(c.licenceNumber.equals(licenceNumber))
			{
				return true;
			}
		}
		return false;
		
	}



	@Override
	public String toString() {
		return "Car [licenceNumber=" + licenceNumber + ", model=" + model + ", color=" + color + "]";
	}
}
