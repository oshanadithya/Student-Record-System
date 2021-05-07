package assignment;
import java.util.HashMap;

public class Specialization {
	
	//creating a hashmap for SSpecialization
	private HashMap <String, Double> SSpecilzation;
	
	public Specialization() {
		this.SSpecilzation= new  HashMap<String, Double>();
	}
	
	public void addSpecialization(String spe,double gpa) {
		this.SSpecilzation.put(spe, gpa);
		
	}
}
