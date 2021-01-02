
public class FamilyStudent extends Student implements IFamilyStudent{

	private int level;

	public FamilyStudent(String name, String id, int level) {
		super(name, id);
		this.level = level;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	@Override
	public String toString() {
		return "FamilyStudent [level=" + level + "]";
	}
	
	@Override
	public double getPAY() {
		
		switch(level)
		{
		case 1:
			return 0.5 * super.getPAY();
			
		case 2:
			return 0.25 *super.getPAY();
			
		case 3:
			return 0;
			
		}
		return super.getPAY();
	}
	
}
