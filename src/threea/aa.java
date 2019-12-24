package threea;

import java.io.*;
import java.util.*;

class nameerror extends Exception
{
	public void output()
	{
		System.out.println("name error");
	}
}

class ageerror extends Exception
{
	public ageerror() {
		System.out.println("age error");
	}
}
class emp{
	int age;
	String name;
	emp(String name,int age)
	{
		this.name=name;
		this.age=age;
		
	}
	public void print() {
		System.out.println("Emp Name :"+name+"\nEmp Age :"+age);
	}
}
public class aa {
	public static void main(String Args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name");
		String name=sc.next();
		System.out.println("age");
		int age=sc.nextInt();
		int k=1,c=1;
		try
		{
			
			try {
				
				int s=Integer.parseInt(name);
				 	
		}
			catch(Exception e)
			{
				k=0;
				
			}
			if(k==1)
			{
				throw new nameerror();
			}
		
			}
		catch(nameerror e)
		{
			c=0;
		}
		
		try {
			if(age>50)
			{
				throw new ageerror();
			}
			
			
			
		}
		catch(ageerror e)
		{
			
			c=0;
			
		}
		
		if(c==1)
		{
			
			emp e=new emp(name,age);
		    e.print();			
		}
		else
		{
			System.out.println("object not created");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}}

