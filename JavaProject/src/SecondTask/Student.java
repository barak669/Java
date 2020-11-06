package SecondTask;

public class Student implements Istudent {
	
	private String name;
	private int id;
	private String dept;
	private int year;
	
	

	public Student(String name, int id, String dept, int year) {
		this.name = name;
		this.id = id;
		this.dept = dept;
		this.year = year;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}

	@Override
	public String getdept() {
		return dept;
	}


	@Override
	public int getyear() {
		return year;
	}


	@Override
	public String instroduce() {
		return "Student [dept=" + dept + ", year=" + year + ", getName()=" + getName() + ", getId()=" + getId() + "]";
	}
	
	

	@Override
	public String getstudentInfo() {
		return "Student [dept=" + dept + ", year=" + year + "]";
	}

	
	

	
	
	}
	
	


