
public class ScholarshipStudent extends Student implements IScholarshipStudent{

	private int scholarship_sum;

	public ScholarshipStudent(String name, String id, int scholarship_sum) {
		super(name, id);
		this.scholarship_sum = scholarship_sum;
	}

	public int getScholarship_sum() {
		return scholarship_sum;
	}

	public void setScholarship_sum(int scholarship_sum) {
		this.scholarship_sum = scholarship_sum;
	}

	@Override
	public String toString() {
		return "ScholarshipStudent [scholarship_sum=" + scholarship_sum + ", toString()=" + super.toString() + "]";
	}
	
	@Override
	public double getPAY() {
		
		return super.getPAY() - scholarship_sum;
	}
	
}
