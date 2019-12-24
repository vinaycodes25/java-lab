package onebme;
import java.sql.*;
public class q1b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Connection con;
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","");
			Statement st=con.createStatement();
			String q1="create table department4(id int primary key,name varchar(20),year varchar(20),head varchar(20),no int)";
			ResultSet rs;
			st.executeUpdate(q1);
			String q2="insert into department4 values(1,'cse','2000','anitha',20)";
			st.executeUpdate(q2);
			String q3="insert into department4 values(2,'ece','2000','sethu',20)";
			st.executeUpdate(q3);
			String q4="insert into department4 values(3,'eee','2001','atha',20)";
			st.executeUpdate(q4);
			
			
			String q6="select no from department4 where name='cse'";
			rs=st.executeQuery(q6);
			while(rs.next())
			{
				System.out.println(rs.getInt("no"));
			}
			st=con.createStatement();
			rs=st.executeQuery("select name from department4 where year='2010'");
			while(rs.next())
			{
				System.out.println("name "+rs.getByte("name"));
			}
			
			
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

}
