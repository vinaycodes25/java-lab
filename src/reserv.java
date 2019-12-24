
import java.util.Scanner;
abstract class reservation{
	abstract boolean reserve(int n,String tos);
	abstract int getavailable();
}

class reservetrain extends reservation{
	static int nost=22;
	int no;
	String type;
	boolean reserve(int n,String t)
	{no=n;
		
		if(n>0&&t!=null&&n<=nost)
		{
			System.out.println("total seats available after booking"+getavailable());
			return true;
		}
		return false;
	}
	
	int getavailable()
	{
		nost=nost-no;
		return nost;
	}
	
	
}


class reservebus extends reservation{
	static int nosb=22;
	int no;
	String type;
	boolean reserve(int n,String t)
	{no=n;
		
		if(n>0&&t!=null&&n<=nosb)
		{
			System.out.println("total seats available after booking bus"+getavailable());
			return true;
		}
		return false;
	}
	
	int getavailable()
	{
		nosb=nosb-no;
		return nosb;
	}
	
	
}


public class reserv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter no of seats and type");
		int no=s.nextInt();
		String tos=s.nextLine();
		reservebus r=new reservebus();
		
		System.out.println(r.reserve(no,tos));
		
		

	}

}
