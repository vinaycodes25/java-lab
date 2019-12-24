package elevena;
import java.util.*;

public class q11a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String input;
		int count=0;
		System.out.println("enter input string");
		input=sc.nextLine();
		input=input.toUpperCase();
		input=input.replaceAll(" ","");
		System.out.println(input);
		for(int i=0;i<input.length()-1;i++)
		{
			char c=input.charAt(i);
			char s=input.charAt(i+1);
			if(c==s)
			{
				count++;
			}
		}
		System.out.println("total no of count "+count);
		
		
		
		
	}

}
