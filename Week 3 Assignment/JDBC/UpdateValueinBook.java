package jdbcjava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class UpdateValueinBook {

	public static void main(String[] args) throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
	      final String url = "jdbc:mysql:///dxc";
	      final String user = "root";
	      final String password = "S@thish321";
	      Connection con = DriverManager.getConnection(url, user, password);
	      Statement st = con.createStatement();
	      String query =  "Update book set author='DDDDD' where bookname='Java'";
	     int n=st.executeUpdate(query);

          if (n==1)
        	  System.out.println("Update Records value");
          else 
              System.out.println("Record value not Updated") ;
	      st.close();
	      con.close();

	}


}