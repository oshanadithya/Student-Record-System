package assignment;
import java.util.*;
import assignment.StudentInterface;

//GeneralClass implements StudentInterface
public class GeneralClass implements StudentInterface {
	//overrides the IDgenerate including the exceptional handling for the id generate
	@Override
	public String IDgenerate() throws ExceptionHandling{
		Random r= new Random(); //object created for Random
		int Max=10000; //int variable initialized with 10000
		int tempStudentID=r.nextInt(Max);
		if(Integer.toString(tempStudentID).length() <2) { //make the student id maximum to 2 overall 4 digits
			throw new ExceptionHandling(); //again throw exceptional handling 
			
		}
		return "IT"+Integer.toString(tempStudentID); //show the auto generated number with "IT" example "IT10000"
	}
	
	//way the values displayed in the launcher page
	@Override
	public void showDetails(String sName, String address, String sex, int bornYear, String specialization, String Title, String a) {
		
		if (Title.equals("Weekend")) { //if the title value (equals) weekend do this else do that
			System.out.println("Student name " + sName);
			System.out.println("Student Address " + address);
			System.out.println("Gender " + sex);
			System.out.println("Student Year " + bornYear);
			System.out.println("Student Specilization " + specialization);
			System.out.println("Student Job Title " + Title);	
		}else {
			System.out.println("Student name " + sName);
			System.out.println("Student Address " + address);
			System.out.println("Gender " + sex);
			System.out.println("Student Year " + bornYear);
			System.out.println("Student Specilization " + specialization);
			System.out.println("Student FreeDay " + Title);
		}
		
		
	}
}
