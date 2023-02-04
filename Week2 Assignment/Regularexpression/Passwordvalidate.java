package regularexpression;

public class Passwordvalidate {
	
	public static boolean checkpasswordvalidate(String password)
	{
	   boolean flag = false;
	   String regex = "^(?=.*[0-9])"+ "(?=.*[a-z])(?=.*[A-Z])" +"(?=.*[!@#$%&_])"+ "(?=\\S+$).{8,20}$";
	   if (password.matches(regex))
	   {
	      flag = true;
	   }
	    return flag;
	 }
	public static void main(String[] args) {

		 String password = "P@$sW0rd";
		 if(checkpasswordvalidate(password))
		 {
			 System.out.println("The Password is Valid ");
		 }
		 else
		 {
			 System.out.println("The Password is InValid ");
		 }
		 
	}
	}
