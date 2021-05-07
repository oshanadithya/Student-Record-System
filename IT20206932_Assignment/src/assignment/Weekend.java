package assignment;
import assignment.StudentInterface;
import assignment.GeneralClass;
import assignment.ExceptionHandling;

//class weekdend
public class Weekend {
	private String SName, Address, Sex, Specialization, JobTitle, StudentID;//properties of weekend class
	int BornYear, M1, M2, M3, M4, M5;
	
	StudentInterface idgen = new GeneralClass(); //idgen object created for get id from General Class 
	
	//weekday class default constructors
	public Weekend() {
		this.SName = null;
		this.Address = null;
		this.Sex = null;
		this.BornYear = 0;
		this.Specialization = null;
		this.JobTitle = null;
	}
	
	//Overloaded constructors for weekday class
	public Weekend(String sName, String address, String sex, String specialization, String Title,
			int bornYear) {
		super();
		SName = sName;
		Address = address;
		Sex = sex;
		Specialization = specialization;
		JobTitle = Title;
		BornYear = bornYear;
	}
	
	//Overloaded constructors for weekday class
	public Weekend(String sName, String address, String sex, String specialization, String Title,
			int bornYear, int m1, int m2, int m3, int m4, int m5) {
		super();
		SName = sName;
		Address = address;
		Sex = sex;
		Specialization = specialization;
		JobTitle = Title;
		BornYear = bornYear;
		M1 = m1;
		M2 = m2;
		M3 = m3;
		M4 = m4;
		M5 = m5;
	}

	
	//getter
	public String getSName() {
		return SName;
	}


	//setter
	public void setSName(String sName) {
		SName = sName;
	}


	//getter
	public String getAddress() {
		return Address;
	}


	//setter
	public void setAddress(String address) {
		Address = address;
	}


	//getter
	public String getSex() {
		return Sex;
	}


	//setter
	public void setSex(String sex) {
		Sex = sex;
	}


	//getter
	public String getSpecialization() {
		return Specialization;
	}


	//setter
	public void setSpecialization(String specialization) {
		Specialization = specialization;
	}


	//getter
	public String getJobTitle() {
		return JobTitle;
	}


	//setter
	public void setJobTitle(String Title) {
		JobTitle = Title;
	}


	//getter
	public int getBornYear() {
		return BornYear;
	}


	//setter
	public void setBornYear(int bornYear) {
		BornYear = bornYear;
	}


	//constructor for addDetails
	public void addDetails(String sName, String address, String sex, int bornYear, String specialization, String Title) {
		SName = sName;
		Address = address;
		Sex = sex;
		Specialization = specialization;
		JobTitle = Title;
		BornYear = bornYear;
	}
	
	
	//constructors for addMarks
	public void addMarks(int m1, int m2, int m3, int m4, int m5) {
		M1 = m1;
		M2 = m2;
		M3 = m3;
		M4 = m4;
		M5 = m5;
	}
	
	
	//check for exceptions
	public String generateID() {
		try {
			this.StudentID=idgen.IDgenerate();
		} catch (ExceptionHandling e) {
			this.generateID();
		}
		return this.StudentID;
		
	}
	
	//show details method
	public void showDetails() {
		idgen.showDetails(SName, Address, Sex, BornYear, Specialization, JobTitle, "Weekend");
	}
	
}
