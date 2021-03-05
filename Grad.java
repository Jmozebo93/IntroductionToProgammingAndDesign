

public class Grad extends Student {
	protected String department;
	
	public Grad() {
		department = null;
	}
	
	public Grad(Student a, String dep) {
		super(a.getFirstName(), a.getLastName(), a.getStudentID(), a.getCourses(), a.getGPA());
		department = dep;
		
	}
	
	public Grad(String fn, String ln, int id, double gpa) {
		super.setFirstName(fn);
		super.setLastName(ln);
		super.setStudentID(id);
		super.setGPA(gpa);
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getDepartment() {
		return department;
	}
	
	@Override
	public String toString() {
		System.out.print(super.toString());
		String grad =" the student has passed"+" "+department+" class";
		
		return grad;
	}

}
