

public class Undergrad extends Student implements Work{
	private double undergradWage;
	private double undergradHours;
	
	public Undergrad() {
		undergradWage = 0.0;
		undergradHours = 0.0;
	}
	
	public Undergrad(Student s, double wage, double hours) {
		super(s.getFirstName(), s.getLastName(), s.getStudentID(), s.getCourses(), s.getGPA());
		undergradWage = wage;
		undergradHours = hours;
	}
	
	public Undergrad(double wage, double hours) {
		undergradWage = wage;
		undergradHours = hours;
		
	}

	public void setUndergradWage(double undergradWage) {
		this.undergradWage = undergradWage;
	}
	public void setundergradHours(double undergradHours) {
		this.undergradHours = undergradHours;
	}
	public double getUndergradWage() {
		return undergradWage;
	}
	
	public double getUndergradHours() {
		return undergradHours;
	}
	public double Salary() {
		double undergradEarnings = 0.0;
		
		undergradEarnings = undergradWage * undergradHours;
		
		return undergradEarnings;
	}
	
	@Override
	public String toString() {

		String inf = " ";
		
		System.out.print(super.toString());
		inf ="\n"+ "The Student has worked for "+undergradHours+" hours"+" for "+undergradWage+" $"+", and has earned "+Salary()+" $";
		
		return inf;
		
	
	}

}
