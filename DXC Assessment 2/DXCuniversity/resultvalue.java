package DXCuniversity;

public class resultvalue {

	public static void main(String[] args) {
		courseregistration course=new courseregistration("Peter",68,1005,true);
		System.out.println("Course allocation Details");
		System.out.println("***************************");
		System.out.println("Student Name :"+course.getName());
		System.out.println("Course Id :"+course.getCourseid());
		System.out.println("Qualifying Exam marks :"+course.getMark());
		System.out.println("Student Registration Id :"+course.getRegistrationid());
		System.out.println("Course Fees :"+course.getCoursefees());
		System.out.println("Hostel Required :"+course.isHostelreq());
	}

}
