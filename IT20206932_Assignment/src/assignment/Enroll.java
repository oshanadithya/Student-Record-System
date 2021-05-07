package assignment;
import java.util.HashMap;

public class Enroll {
	
	//implement collection framework HashMap class 
	private HashMap<String, String> enrollStudent;
	
	//Enroll class implemented  take to string values for student id and specialization
	public Enroll() {
		this.enrollStudent= new  HashMap<String, String>();
	}
	
	public void enrollStudent(String SID, String spe) {
		this.enrollStudent.put(SID, spe);
		
	}
	
	//display Enroll students
	public void displayEnrolledStudents() {
		for (String SName: this.enrollStudent.keySet()) {
		    String key = SName.toString();
		    String value = this.enrollStudent.get(SName).toString();
		    System.out.println(key + " :" + value);
		}
	}
}
