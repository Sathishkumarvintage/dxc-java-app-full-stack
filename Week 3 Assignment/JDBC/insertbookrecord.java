package jdbcjava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class insertbookrecord {
	private static final String url="jdbc:mysql:///dxc";
	private static final String user="root";
	private static final String password="S@thish321";
	private static final String INSERT_book_QUERY="INSERT INTO book Values(?,?,?,?) ";

	public static void main(String[] args){
		Scanner scan=null;
		int n=0;
		int bookid=0;
		String bookname=null;
		String author=null;
		int edition=0;
		String query=null;
		Connection con=null;
		PreparedStatement ps=null;
		int result=0;
		try
		{
			scan=new Scanner(System.in);
			if(scan!=null)
			{
				System.out.println("Enter Number of book Details:");
				n=scan.nextInt();		
			}
			con=DriverManager.getConnection(url, user, password);
			if(con!=null)
			{
				ps=con.prepareStatement(INSERT_book_QUERY);
			}
			if(scan!=null && ps!=null)
			{
				for(int i=0;i<n;i++)
				{
					System.out.println("Enter Details "+(i+1));
					System.out.println("Book Id :");
					bookid=scan.nextInt();
					System.out.println("Book Name :");
					bookname=scan.next();
					System.out.println("Author Name :");
					author=scan.next();
					System.out.println("Edition :");
					edition=scan.nextInt();
					ps.setInt(1, bookid);
					ps.setString(2,bookname);
					ps.setString(3,author);
					ps.setInt(4, edition);
					result=ps.executeUpdate();
				}
			}
			if(result==0)
			{
				System.out.println("Records Insertion failed");
			}
			else
			{
				System.out.println("Records insertion Successfully");
			}
		}catch(SQLException se)
		{
			se.printStackTrace();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				if(ps!=null)
					ps.close();
			}catch(SQLException se)
			{
				se.printStackTrace();
			}
			try
			{
				if(con!=null)
					con.close();
			}catch(SQLException se)
			{
				se.printStackTrace();
			}
			try
			{
				if(scan!=null)
					con.close();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}

}
