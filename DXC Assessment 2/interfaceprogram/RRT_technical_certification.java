package interfaceprogram;
interface certificate
{
	double calculate(double total);
}
public class RRT_technical_certification {
	private String studentname;
	private String coursename;
	private int registrationid;
	private int admissiontestmark;
	private static int counter;
	static
	{
		counter=1000;
	}
	public RRT_technical_certification(String studentname,String coursename,int admissiontestmark)
	{
		this.registrationid=++counter;
		this.studentname=studentname;
		this.coursename=coursename;
		this.admissiontestmark=admissiontestmark;
	}
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public String getCoursename() {
		return coursename;
	}
	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}
	public int getRegistrationid() {
		return registrationid;
	}
	public void setRegistrationid(int registrationid) {
		this.registrationid = registrationid;
	}
	public int getAdmissiontestmark() {
		return admissiontestmark;
	}
	public void setAdmissiontestmark(int admissiontestmark) {
		this.admissiontestmark = admissiontestmark;
	}
	

}
