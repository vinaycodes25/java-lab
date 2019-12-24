package nineb;


import java.sql.*;
import java.util.Scanner;

public class q9b {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
	Connection con;
	int bankid=0;
	String user=null;
	float bal=0;
	try{
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bank"
				,"root","");
		con.setAutoCommit(false);
		Savepoint sp=null;
		while(true)
		{
			System.out.println("1.new banker 2.deposit 3.withdraw 4.rollback/commit 5.display ");
			int ch=input.nextInt();
			switch(ch)
			{
			case 1:
				System.out.println("Enter the bankid username and balance");
				 bankid=input.nextInt();
				user=input.next();
				bal=input.nextFloat();
				
				String q1="insert into bank values(?,?,?)";
				PreparedStatement pst=con.prepareStatement(q1);
				pst.setString(2, user);
				pst.setFloat(3, bal);
				pst.setInt(1, bankid);
				pst.execute();
				System.out.println("INSERTED SUCCESFULLY ");
				break;
				
			case 2:
				System.out.println("Enter the money to be deposited :");
				
				float d=(float)input.nextInt();
				bal=bal+d;
				
				String q2="update bank set bal=? where bankid=?";
				
				PreparedStatement st=con.prepareStatement(q2);
				st.setFloat(1, bal);
				st.setInt(2, bankid);
				st.execute();
				System.out.println("DEPOSITED SUCCESSFULLY");
				break;
				
			case 3:
				sp=con.setSavepoint();
				System.out.println("Balance :"+bal);
				System.out.println("Enter the money to be withdrawn :");
				float w=input.nextFloat();
				bal=bal-w;
				if(bal>0)
				{
				String q3="update bank set bal='"+bal+"' where bankid='"+bankid+"'";
				Statement st1=con.createStatement();
				int n1=st1.executeUpdate(q3);
				System.out.println("WITHDRAWN SUCCESSFULLY ");
				}
				else
				{
					System.out.println("WITHDRAWN UNSUCCESSFUL balance too low ");
				}
				break;
			case 4:
					System.out.println("1.rollback() 2.commit()");
					int ch1=input.nextInt();
					if(ch1==1)
					{
						con.rollback(sp);
					}
					else if(ch1==2)
					{
						con.commit();
					}
					break;
			case 5:
					System.out.println("The details are:");
					Statement st3=con.createStatement();
					ResultSet rs=st3.executeQuery("select * from bank ");
					while(rs.next())
					{
						System.out.println("Bank ID :" + rs.getInt(1));
						System.out.println("Bank USER NAME  :" + rs.getString(2));
						System.out.println("Current Balance :" + rs.getFloat(3));
					}
					break;	
			}
		}
	}
	catch(Exception e)
	{System.out.println(e);}
	}

	}

