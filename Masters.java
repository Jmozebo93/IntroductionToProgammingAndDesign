
public class Masters extends Grad implements Work{
	private double gradSalary;
	
	public Masters() {
		gradSalary = 0.0;
	}
	
	public Masters(Grad s, double pay, String dept) {
		super(s.getFirstName(), s.getLastName(), s.getStudentID(), s.getGPA());
		gradSalary = pay;
		department = dept;
	}
	
	
	
	public Masters(double payolla) {
		gradSalary = payolla;
	}
	public void setGradSalary(double gradSalary) {
		this.gradSalary = gradSalary;
	}
	public double getGradSalary() {
		return gradSalary;
	}
	
	
	public double Salary() {
		return gradSalary;
	}
	
	@Override
	public String toString() {
		System.out.print(super.toString());
		String sal ="\n"+"The Master degree student earns "+"$ "+getGradSalary()+" per hour";
		
		return sal;
	}
	

}
