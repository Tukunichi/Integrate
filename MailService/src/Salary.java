
public class Salary extends SuperClass{
	
	private String from, to;
	private int salary;
	
	public Salary(String from, String to, int salary) {
		super(from, to);
		this.salary = salary;
	}
	
	@Override
	public Integer getContent() {
		return salary;
	}
}
