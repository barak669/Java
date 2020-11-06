package FirstTask;

public class DeptChair extends SeniorStaff {

	private String DeptChair;

	public DeptChair(String name, String dept, String DeptChair) {
		super(name, dept);
		this.DeptChair = DeptChair;
	}
		
	public String introduce() {
		return "DeptChair [DeptChair=" + this.DeptChair + ", Name=" + "Prof" + this.getName() + ", Dept'=" + this.getDept() + "]";
	}
	

}
