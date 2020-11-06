package SecondTask;

public class Employee extends Student implements Iemployee{
	
	private String workPlace;
	private String job;
	
	
	public Employee(String name, int id, String workPlace, String job) {
		super(name, id, job, id);
		this.workPlace = workPlace;
		this.job = job;
	}


	@Override
	public String getworkPlace() {
		return workPlace;
	}


	@Override
	public String getjob() {
		return job;
	}


	@Override
	public String instroduce() {
		return "Employee [workPlace=" + workPlace + ", job=" + job + ", getworkPlace()=" + getworkPlace()
				+ ", getjob()=" + getjob() + ", getName()=" + getName() + ", getId()=" + getId() + "]";
	}
	
	public String getworkInfo() {
		return "Employee [workPlace=" + workPlace + ", job=" + job + "]";
	}
	
	
	
	
	
	

}
