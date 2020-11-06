package task4Page24;

public class Check {
	
	private String ChNumber;
	private String Bname;
	private int DepNumber;
	private float Amount;
	
	public Check(String chNumber, String bname, int depNumber, Float amount) {
		ChNumber = chNumber;
		Bname = bname;
		DepNumber = depNumber;
		Amount = amount;
	}

	public String getChNumber() {
		return ChNumber;
	}

	public void setChNumber(String chNumber) {
		ChNumber = chNumber;
	}

	public String getBname() {
		return Bname;
	}

	public void setBname(String bname) {
		Bname = bname;
	}

	public int getDepNumber() {
		return DepNumber;
	}

	public void setDepNumber(int depNumber) {
		DepNumber = depNumber;
	}

	public Float getAmount() {
		return Amount;
	}

	public void setAmount(float amount) {
		Amount = amount;
	}

	@Override
	public String toString() {
		return "Check [ChNumber=" + ChNumber + ", Bname=" + Bname + ", DepNumber=" + DepNumber + ", Amount=" + Amount
				+ "]";
	}

	
	
	
	
	
	
	

}
