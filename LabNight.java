import java.util.ArrayList;

public class LabNight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Course math = new Course("Math", 4.0);
		ArrayList<Course> junior = new ArrayList<Course>();
		junior.add(math);
		
		
		
		Student malaika = new Student("Malaika","Mozebo",172882,junior, 3.0 );
		Undergrad CompSc = new Undergrad(malaika, 8.0, 9.0);
		Grad Phys = new Grad(malaika, "Physics");
		Masters Engchem = new Masters(Phys, 24.0, "Physics");
		PhD CompEng = new PhD(Phys, "Physics");
		CompEng.setPhDStipend(9.0);
		
		
		System.out.println(malaika.toString());
		System.out.println();
		System.out.println(CompSc.toString());
		System.out.println();
		System.out.println(Phys.toString());
		System.out.println();
		System.out.println(Engchem.toString());
		System.out.println();
		System.out.println(CompEng.toString());
		

	}

}
