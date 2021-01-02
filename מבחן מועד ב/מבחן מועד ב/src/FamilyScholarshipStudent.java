
public class FamilyScholarshipStudent extends Student implements IScholarshipStudent, IFamilyStudent {

	private ScholarshipStudent ss;
	private FamilyStudent fs;
	
	public FamilyScholarshipStudent( String name, String id, int level , int scholarship_sum)
	{
		super(name , id);
		ss = new ScholarshipStudent(name , id, scholarship_sum);
		fs = new FamilyStudent ( name , id, level);
	}

	@Override
	public int getLevel() {
		
		return fs.getLevel();
	}

	@Override
	public void setLevel(int level) {
		fs.setLevel(level);
		
	}

	@Override
	public int getScholarship_sum() {
		
		return ss.getScholarship_sum();
	}

	@Override
	public void setScholarship_sum(int scholarship_sum) {
		ss.setScholarship_sum(scholarship_sum);
		
	}
	
	
	
}
