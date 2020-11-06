package HomeWork1;

public class Store  {

	private String name;
	private int monthlyRent;
	
	public Store(String name, int monthlyRent) {
		this.name = name;
		this.monthlyRent = monthlyRent;
		}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMonthlyRent() {
		return monthlyRent;
	}

	public void setMonthlyRent(int monthlyRent) {
		this.monthlyRent = monthlyRent;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + monthlyRent;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Store other = (Store) obj;
		if (monthlyRent != other.monthlyRent)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	

	
	
	
}














	







