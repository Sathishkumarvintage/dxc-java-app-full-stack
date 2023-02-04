package dxc;
class club
{
	private static int counter;
	private String registrationid;
	private String name;
	private long cnumber;
	private String city;
	static
	{
		counter=10000;
	}
	public club(String name,long cnumber,String city)
	{
		this.registrationid="D"+ ++counter;
		this.name=name;
		this.cnumber=cnumber;
		this.city=city;
	}
	public String getRegistrationid() {
		return registrationid;
	}
	public void setRegistrationid(String registrationid) {
		this.registrationid = registrationid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getCnumber() {
		return cnumber;
	}
	public void setCnumber(long cnumber) {
		this.cnumber = cnumber;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
}

public class danceclub {

	public static void main(String[] args) 
	{
		club c1=new club("Sathish",9874563214l,"Chennai");
		club c2=new club("Kumar",8874563214l,"Chennai");
		club[]clubs= {c1,c2};
		for(club c:clubs)
		{
			System.out.println("Hi "+c.getName()+" your Registration Id is "+c.getRegistrationid());
		}
	}

}
