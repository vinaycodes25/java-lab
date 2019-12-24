package oneb;
import java.sql.*;

public class q1bme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String driver="com.mysql.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/";
		String db="mydb";
		try {
		Class.forName(driver);
		Connection con=DriverManager.getConnection(url+db,"root","");
		Statement st;
		st=con.createStatement();
	    ResultSet rs;
	    rs=st.executeQuery("select noofemployees from department where name in ('cse')");
	    while(rs.next())
	    {
	    	int no=rs.getInt("noofemployees");
	    	System.out.println("naao"+no);
	    }
	    rs=st.executeQuery("select name,departmentid from department where year = 2010");
	    while(rs.next())
	    {
	    	String a=rs.getString("name");
	    	int b=rs.getInt("departmentid");
	    	System.out.println("name"+a+"id"+b);
	    }
	    
		
		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
		

	}

}
