package HomeWork1;

public class FlowerStore extends Store  {
	
	int monthlyOrderNumber;
	
	public FlowerStore(int monthlyRent, String name, int monthlyOrderNumber) {
		super(name, monthlyRent);
		this.monthlyOrderNumber = monthlyOrderNumber;
	}

	
	public int getMonthlyOrderNumber() {
		return monthlyOrderNumber;
	}

	public void setMonthlyOrderNumber(int monthlyOrderNumber) {
		this.monthlyOrderNumber = monthlyOrderNumber;
	}

	@Override
	public String toString() {
		return "FlowerStore [monthlyOrderNumber=" + monthlyOrderNumber + ", getMonthlyRent()=" + getMonthlyRent()
				+ ", getName()=" + getName() + "]";
	}


}

