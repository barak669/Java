package task6Page26;

public class Toy {
	
	private int code;
	private String group;
	private String manufact;
	private int year;
	
	public Toy(int code, String group, String manufact, int year) {
		this.code = code;
		this.group = group;
		this.manufact = manufact;
		this.year = year;
	}
		
	public Toy() {
		this.code = 0;
		this.group = "NA";
		this.manufact = "NA";
		this.year = 0;
	}

	public int getCode() {
		return code;
	}

	public String getGroup() {
		return group;
	}

	public String getManufact() {
		return manufact;
	}

	public int getYear() {
		return year;
	}
	
	public void Set(
			int code,
			String group,
			String manufact,
			int year
			) {
		this.code = code;
		this.group = group;
		this.manufact = manufact;
		this.year = year;
	}
	
	
	public String toString() {
		return "Toy [code=" + code + ", group=" + group + ", manufact=" + manufact + ", year=" + year + "]";
	}
	
	
	
		
		
	
	

}
