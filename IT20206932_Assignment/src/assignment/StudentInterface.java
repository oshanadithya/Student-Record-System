package assignment;
import assignment.ExceptionHandling;


//Interface class to implement ID generate class and show details
public interface StudentInterface {
	
	public String IDgenerate() throws ExceptionHandling;
	public void showDetails(String sName, String address, String sex, int bornYear, String specialization, String Title, String a);
}
