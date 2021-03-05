
public class PhD extends Grad implements Work {
	private double phdStipend;
	
	
	public PhD() {
		phdStipend = 0.0;
	}
	
	public PhD(Grad d,String dept) {
		super(d.getFirstName(), d.getLastName(), d.getStudentID(), d.getGPA());
		department = dept;
		phdStipend = 0.0;
		
	}
	
	public void setPhDStipend(double phdStipend) {
		this.phdStipend = phdStipend;
	}
	public double getPhDStipend() {
		return phdStipend;
	}
	public double Salary() {
		return phdStipend;
	}
	
	@Override
	public String toString() {
		System.out.print(super.toString());
		String phd ="\n"+"The PhD student earns $ "+Salary()+" per hour";
		
		return phd;
	}

}
