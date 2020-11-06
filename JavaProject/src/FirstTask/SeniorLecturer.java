package FirstTask;

public class SeniorLecturer extends SeniorStaff {

	private String SeniorLecturer;

	public SeniorLecturer(String name, String dept, String SeniorLecturer) {
		super(name, dept);
		this.SeniorLecturer = SeniorLecturer;
	}

	public String introduce() {
		return "SeniorLecturer [SeniorLecturer=" + SeniorLecturer + ", Name=" + "Dr" + this.getName() + ", Dept="
				+ this.getDept() + "]";
	}
		

}
