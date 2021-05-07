package assignment;

public class launcher {

	public static void main(String[] args) {
		
		Weekend student1 = new Weekend();
		student1.addDetails("Jane", "Malabe", "F", 1990, "DS", "QA");
		String studentid = student1.generateID();
		student1.addMarks(56, 34, 12, 46, 78);
		student1.showDetails();
		System.out.println("Student ID "+studentid);
		System.out.println();
		
		Weekday student2 = new Weekday();
		student2.addDetails("Jim", "Kalutara", "M", 1991, "SE", "Tuseday");
		String studentid2 = student2.generateID();
		student2.addMarks(56, 34, 12, 46, 78);
		student2.showDetails();
		System.out.println("Student ID "+studentid2);
		System.out.println();
		
		Enroll sem1 = new Enroll();
		sem1.enrollStudent(studentid, "IT");
		sem1.enrollStudent(studentid2, "SE");
		System.out.println("\n\nEnrolled student details");
		sem1.displayEnrolledStudents();
		
		Specialization spe = new Specialization();
		spe.addSpecialization("SE", 2.75);
		spe.addSpecialization("DS", 3.5);
	}

}
