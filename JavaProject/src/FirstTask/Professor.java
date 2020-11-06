package FirstTask;

public class Professor extends SeniorStaff {
	
	private String Professor;

	public Professor(String name, String dept, String Professor) {
		super(name, dept);
		this.Professor = Professor;
	}

	public String introduce() {
		return "Professor [Professor=" + Professor + ", Name=" + "Prof" + this.getName() + ", Dept'=" + this.getDept() + "]";
	}

}
