package oneb;
import java.sql.*;


public class q1b {

	public static void main(String[] args) {
		
		Statement st,st2;
		ResultSet rs,rs2;
		Connection con;
		
		String driver="com.mysql.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/";
		String dbname="mydb";
		String username="root";
		String password="";
		
		try{
			Class.forName(driver);
			con=DriverManager.getConnection(url+dbname,username,password);
			String q1="select noofemployees from department where name='cse'";
			st=con.createStatement();
			rs=st.executeQuery(q1);
			while(rs.next())
			{
				int no=rs.getInt("noofemployees");
				System.out.println("No of employees = "+no);
				
			}
			
			st2=con.createStatement();
			String q2="select name,departmentid from department where year ='2010'";
			rs2=st2.executeQuery(q2);
			while(rs2.next())
			{
				String name=rs2.getString("name");
				int did=rs2.getInt("departmentid");
				System.out.println("Name : "+name+" Did: "+did);
				
			}
			st.close();
			st2.close();
			con.close();
		}
		catch(Exception e)
		{
			System.out.print(e);
		}
		
		
		
		
	}

}