package Teacher_Details;

public class Details {

	public static void main(String[] args) {
		Teacher obj1=new Teacher("Alex","Java Fundamentals",1200L); 
		Teacher obj2=new Teacher("John","RDBMS",800L);
		Teacher obj3=new Teacher("Sam","Networking",900L);
		Teacher obj4=new Teacher("Maria","Python",900L);
		Teacher[]teach= {obj1,obj2,obj3,obj4};
		for(Teacher t:teach)
		{
			System.out.println("Name :"+t.getTeachername()+", Subject :"+t.getSubject()+", Salary :"+t.getSalary());
		}
	}

}
