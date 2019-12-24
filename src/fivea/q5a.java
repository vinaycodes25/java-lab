package fivea;

class check_prime{
	boolean isprime(int a) {
		for(int i=2;i<a/2;i++)
			{if(a%i==0)
				return false;
			}
		return true;
	}
	 synchronized void displayPrime(int n) {
		if(n==1) {
			for(int i=2;i<=100;i++)
				if(isprime(i))
					System.out.println("Prime(1-100) :"+i);
			
					
		}
		else if(n==2) {
			for(int i=101;i<=200;i++)
				if(isprime(i))
					System.out.println("Prime(101-200) :"+i);
		}
	}
}
class T1 extends Thread{
	check_prime cp;
	public T1(check_prime cp1){
		cp=cp1;
		
	}
	public void run() {
		cp.displayPrime(1);
	}
}
class T2 extends Thread{
	check_prime cp;
	public T2(check_prime cp2){
		cp=cp2;
	
	}
	public void run() {
		cp.displayPrime(2);
	}
}
public class q5a {
	public static void main(String arg[]) {
	check_prime cp=new check_prime();
	Thread t1=new T1(cp);
	Thread t2=new T2(cp);
	t1.start();
	t2.start();
	}
}

