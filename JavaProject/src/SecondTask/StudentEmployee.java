package SecondTask;


public class StudentEmployee extends Student implements Istudent, Iemployee {

	private Student s;
	private Employee e;
	

	public StudentEmployee(String name, int id, String dept, int year, String workPlace, String job) {
		super(name, id, dept, year);
		s = new Student (name, id ,dept, year);
		e = new Employee (name, id, workPlace, job);
	}

	@Override
	public String getworkPlace() {
		return e.getworkPlace();
	}

	@Override
	public String getjob() {
		return e.getjob();
	}

	@Override
	public String getdept() {
		return s.getdept();
	}

	@Override
	public int getyear() {
		return s.getyear();
	}
	
	@Override
	public String getstudentInfo() {
		return s.getstudentInfo();
	} 
	
	@Override
	public String getworkInfo() {
		return e.getworkInfo();
	}

	@Override
	public String instroduce()  {
		return "StudentEmployee [s=" + s + ", e=" + e + ", workPlace()=" + getworkPlace() + ", job()=" + getjob()
				+ ", dept()=" + getdept() + ", year()=" + getyear() + ", getName()=" + getName() + ", getId()=" + getId()
				+ "]";
	}
	
	
}
