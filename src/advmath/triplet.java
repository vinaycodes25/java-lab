package advmath;

public class triplet
{
	
public void fun(int limit){
	int m,n,a=0,b=0,c=0,l;
	l=limit;
	m=2;
	while(c<l)
	{
		for(n=1;n<m;++n)
			
		{
			a=m*m-n*n;
			b=2*m*n;
			c=m*m+n*n;
			if(c>limit)
				break;
			System.out.println("triplets are"+a+b+c);
			
		}
		m++;
	}
	}
	
}