package student;

public class info {
	String usn;
	int s1,s2,s3;
	String dname,sgpa;
	public void setdata1(String usn,int s1,int s2,int s3,String dname,String sgpa)
	{
		this.usn=usn;
		this.s1=s1;
		this.s2=s2;
		this.s3=s3;
		this.dname=dname;
		this.sgpa=sgpa;
		
	}
	
	public void display1()
	{
		System.out.println(usn+s1+s2+s3+dname+sgpa);
	}
	

}
