package onea;
import java.util.*;
import java.io.*;
 interface datastructure{
	 
	 void push(int a);
	 int pop();
	 boolean isempty();
	 boolean isfull();
	 
 }
 
  class stack implements datastructure
 {
	 int a[]=new int[20];
	 int top=-1;
	 
	public void push(int n)
	 {
		 if(isfull())
		 {
			 System.out.println("stack full");
			 
		 }
		 a[++top]=n;
		 
	 }
	public int pop()
	{
		if(isempty())
		{
			System.out.println("stack empty");
			return -1;
		}
		
		return a[top--];
	}
	 
	public boolean isfull()
	{
		if(top==a.length-1)
			return true;
		else
			return false;
	}
	public boolean isempty()
	{
		if(top==-1)
		{
			return true;
		}
		else
			return false;
	}
	
 }
 
 
 
 
public class vinay {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		stack s=new stack();
		Scanner sc=new Scanner(System.in);
		while(true) {
			
			System.out.println("enter 1 to push 2 pop 3 exit");
			int c=sc.nextInt();
			
			if(c==3)
				break;
			switch(c)
			{
			case 1: 
				System.out.println("enter element to push");
				int x=sc.nextInt();
				s.push(x);
				System.out.println("the val"+x);
				break;
			case 2:
				int y=s.pop();
			    if(y!=-1) {	
				System.out.println("the val"+y);
				break;}
			
			}
			
		}
		

	}

}
