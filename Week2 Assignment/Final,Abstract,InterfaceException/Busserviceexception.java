package dxc;

class Busbooking
{
	private int bookingid;
	private String destination;
	private String trippackage;
	private String coupencode;
	private int nomember;
	public int getBookingid() {
		return bookingid;
	}
	public void setBookingid(int bookingid) {
		this.bookingid = bookingid;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getTrippackage() {
		return trippackage;
	}
	public void setTrippackage(String trippakage) {
		this.trippackage = trippakage;
	}
	public String getCoupencode() {
		return coupencode;
	}
	public void setCoupencode(String coupencode) {
		this.coupencode = coupencode;
	}
	public int getNomember() {
		return nomember;
	}
	public void setNomember(int nomember) {
		this.nomember = nomember;
	}
	
}

class invaliddestinationException extends Exception
{
	public invaliddestinationException(String message)
	{
		super(message);
	}
}

class invalidtrippackageException extends Exception
{
	public invalidtrippackageException(String message)
	{
		super(message);
	}
}

class invalidcoupencodeException extends Exception
{
	public invalidcoupencodeException(String message)
	{
		super(message);
	}
}
class validator
{
	public boolean validatedestination(String destination)
	{
		if(destination.equalsIgnoreCase("washinton Dc")|| destination.equalsIgnoreCase("philadelphia") || destination.equalsIgnoreCase("orlando") || destination.equalsIgnoreCase("boston") || destination.equalsIgnoreCase("atlanta"))
		{
			return true;
		}
		else
		return false;
		
	}
	public boolean validatetrippackage(String trippackage)
	{
		if(trippackage.equalsIgnoreCase("regular") || trippackage.equalsIgnoreCase("premium"))
				{
					return true;
				}
		else
		return false;
		
	}
	public boolean validatecoupencode(String coupencode, int nomember)
	{
		if(coupencode.equalsIgnoreCase("BIGBUS") && nomember>=10)
		{
			return true;
		}
		else if(coupencode.equalsIgnoreCase("MAGIBUS") && nomember>=15)
		{
		return true;
		}
		else
		return false;
		
	}
	public void validate(Busbooking busbooking) throws invaliddestinationException,invalidtrippackageException,invalidcoupencodeException
	{
		if(!validatedestination(busbooking.getDestination())) 
		{
			System.out.print("Invalid Destination");
			
		}
		else if (!validatetrippackage(busbooking.getTrippackage())) 
		{
			System.out.print("Invalid Trip Package");
			
		}
		else if(!validatecoupencode(busbooking.getCoupencode(), busbooking.getNomember())) 
		{
			System.out.print("Invalid Couponcode");
			
		}
	}
}

public class Busserviceexception {

	public static void main(String[] args) 
	{
		try
		{
		Busbooking busbooking=new Busbooking();
		busbooking.setBookingid(101);
		busbooking.setDestination("orlando");
		busbooking.setTrippackage("regular");
		busbooking.setCoupencode("BIGBUS");
		busbooking.setNomember(11);
		validator validator=new validator();
		validator.validate(busbooking);
		System.out.println("Booking Successful");
		}
		catch (invaliddestinationException|invalidtrippackageException|invalidcoupencodeException e) 
	     {
	         System.out.println(((Throwable) e).getMessage());
	         System.out.println("Your booking was not successful,Please try again");

	     }
		

	}

}
