package assignment;

//ExceptionHandling inherits Exception class
@SuppressWarnings("serial")
public class ExceptionHandling extends Exception {
	
	public ExceptionHandling() {
		System.out.println("Invalid Student ID Generation, System will generate a new Student ID");
	}
}
