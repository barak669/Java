package FirstTask;

public class Lecturer extends SeniorStaff  {
	
	
	private String Lecturer;

	public Lecturer(String name, String dept, String Lecturer) {
		super(name, dept);
		this.Lecturer = Lecturer;
	}

	public String introduce() {
		return "Lecturer [Lecturer=" + Lecturer + ", Name=" + "Dr" + this.getName() + ", Dept'=" + this.getDept() + "]";
	}


}
