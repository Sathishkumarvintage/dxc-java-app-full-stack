package jdbcjava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SearchValueinBook {

	public static void main(String[] args) throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
	      final String url = "jdbc:mysql:///dxc";
	      final String user = "root";
	      final String password = "S@thish321";
	      Connection con = DriverManager.getConnection(url, user, password);
	      Statement st = con.createStatement();
	      String query =  "SELECT bookname,author FROM book";
	     int n=st.executeUpdate(query);

          if (n==1)
        	  System.out.println("Records value");
          else 
              System.out.println("Record value not Displayed") ;
	      st.close();
	      con.close();

	}


}