package fourteenb;
import java.sql.*;

public class q14b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con;
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","");
			Statement st=con.createStatement();
			
			String q1="select * from vinay where cgpa> 9";
			ResultSet r1=st.executeQuery(q1);
			while(r1.next())
			{
				System.out.println(r1.getString(1)+r1.getString(2)+r1.getString(3)+r1.getString(4));
				
				
				
			}
			String q2="select id,name,cgpa from vinay";
		     Statement st1=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
		     ResultSet r2=st1.executeQuery(q2);
		     while(r2.next())
		     {
		    	 if(r2.getString("name").equals("john"))
		    	 {
		    		 r2.updateDouble("cgpa", 9.4);
		    		 r2.updateRow();
		    		 System.out.println("updated");
		    	 }
		    	 
		    	 
		     }
		     while(r2.next())
				{
					System.out.println(r2.getString(1)+r2.getString(2)+r2.getString(3)+r2.getString(4));
					
					
					
				}
		     
			
			
			
			
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
