package DXCuniversity;

public class courseregistration {
	private String name;
	private int registrationid;
	private float mark;
	private double coursefees;
	private int courseid;
	private boolean hostelreq;
	private static int counter;
	static
	{
		counter=5000;
	}
	
	public courseregistration(String name,float mark,int courseid,boolean hostelreq)
	{
		this.registrationid=++counter;
		this.name=name;
		this.mark=mark;
		this.courseid=courseid;
		this.hostelreq=hostelreq;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRegistrationid() {
		return registrationid;
	}

	public void setRegistrationid(int registrationid) {
		this.registrationid = registrationid;
	}

	public float getMark() {
		return mark;
	}

	public void setMark(float mark) {
		this.mark = mark;
	}

	public double getCoursefees() {
		return coursefees;
	}

	public void setCoursefees(double coursefees) {
		this.coursefees = coursefees;
	}

	public int getCourseid() {
		return courseid;
	}

	public void setCourseid(int courseid) {
		this.courseid = courseid;
	}

	public boolean isHostelreq() {
		return hostelreq;
	}

	public void setHostelreq(boolean hostelreq) {
		this.hostelreq = hostelreq;
	}
	public boolean validatemark()
	{
		if(Mark<65)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
	public boolean validatecourseid()
	{
		if(getCourseid()<1001 && getCourseid()>1005)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
	public double coursefees()
	{
		if(getCourseid()==1001)
		{
			if(getMark()>=65 && getMark()<=69)
			{
				coursefees=55000-55000*5/100;
			}
			else if(getMark()>=70 && getMark()<=84)
			{
				coursefees=55000-55000*10/100;
			}
			else
			{
				coursefees=55000-55000*15/100;
			}
		}
		else if(getCourseid()==1002)
		{
			if(getMark()>=65 && getMark()<=69)
			{
				coursefees=35675-35675*5/100;
			}
			else if(getMark()>=70 && getMark()<=84)
			{
				coursefees=35675-35675*10/100;
			}
			else
			{
				coursefees=35675-35675*15/100;
			}
		}
		else if(getCourseid()==1003)
		{
			if(getMark()>=65 && getMark()<=69)
			{
				coursefees=28300-28300*5/100;
			}
			else if(getMark()>=70 && getMark()<=84)
			{
				coursefees=28300-28300*10/100;
			}
			else
			{
				coursefees=28300-28300*15/100;
			}
		}
		else if(getCourseid()==1004)
		{
			if(getMark()>=65 && getMark()<=69)
			{
				coursefees=22350-22350*5/100;
			}
			else if(getMark()>=70 && getMark()<=84)
			{
				coursefees=22350-22350*10/100;
			}
			else
			{
				coursefees=22350-22350*15/100;
			}
		}
		else if(courseid==1005)
		{
			if(mark>=65 && mark<=69)
			{
				coursefees=(115000-115000*5/100);
			}
			else if(getMark()>=70 && getMark()<=84)
			{
				coursefees=115000-115000*10/100;
			}
			else
			{
				coursefees=115000-115000*15/100;
			}
		}
		return coursefees;
		
	}

}
