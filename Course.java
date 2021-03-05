
public class Course {
	private String courseName;
	private double gpaEarned;
	
	public Course() {
		courseName = null;
		gpaEarned = 0;
		
	}
	public Course(String course, double gp) {
		courseName = course;
		gpaEarned = gp;
	}
	
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public void setGPAEarned(double gpaEarned) {
		this.gpaEarned = gpaEarned;
	}
	public String getCourseName() {
		return courseName;
	}
	public double getGPAEarned() {
		return gpaEarned;
	}

}
