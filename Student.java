import java.util.ArrayList;

public class Student {
	public String FirstName;
	public String LastName;
	public int StudentID;
	public ArrayList<Course> Courses;
	public double gpa;
	
	public Student() {
		FirstName = null;
		LastName = null;
		StudentID = 0;
		Courses = new ArrayList<Course>();
		gpa = 0;
	}
	public Student(String name, String last,int ID, ArrayList<Course>math, double g) {
		FirstName = name;
		LastName = last;
		StudentID = ID;
		Courses = math;
		gpa = g;
	}
	
	
	public void setFirstName(String FirstName) {
		this.FirstName = FirstName;
	}
	
	public void setLastName(String LastName) {
		this.LastName = LastName;
	}
	
	public void setCourses(ArrayList<Course> Courses) {
		this.Courses = Courses;
	}
	
	public void setStudentID(int StudentID) {
		this.StudentID = StudentID;
	}
	
	public void setGPA(double gpa) {
		this.gpa = gpa;
	}
	
	public String getFirstName() {
		return FirstName;
	}
	public String getLastName() {
		return LastName;
	}
	public ArrayList<Course> getCourses(){
		return Courses;
	}
	public int getStudentID() {
		return StudentID;
	}
	
	public double getGPA() {
		return gpa;
	}
	public String toString() {
		String studentInfo = null;
		
		studentInfo = "The student information \n"+
		"First name: "+getFirstName() +", Last name: "+getLastName()+", Student ID: "+getStudentID()+", Grade point Average: "+gpa+".";
		
		return studentInfo;		
	}
	
	public void addCourses(Course courses) {
		Courses.add(courses);
		
	}
	public void calGPA() {
		double gpaAverage = 0.0;
		
		for(int i = 0; i < Courses.size();i++) {
			gpaAverage = gpaAverage + Courses.get(i).getGPAEarned();
			
		}
		
		gpa = gpaAverage / 2;	
		
	}
	
	

}
