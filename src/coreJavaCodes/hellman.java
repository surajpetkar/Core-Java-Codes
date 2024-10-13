package timepass;
import java.util.*;
import java.lang.*;
public class hellman 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a=5,b=3,p,q;
		double R,S,Rk,Sk;
		do 
		{
		System.out.println("Enter the first prime no. :");
		p=sc.nextInt();
		check(p);
		System.out.println("Enter the second prime no. :");
		q=sc.nextInt();
		check(q);
		}while(p==q);
		System.out.println("Enter the first random no. :");
		a=sc.nextInt();
		System.out.println("Enter the second random no. :");
		b=sc.nextInt();
		R=Math.pow(q,a)%p;
		System.out.println("R="+R);
		
		S=Math.pow(q,b)%p;
		System.out.println("S="+S);
		
		Rk=Math.pow(S, a)%p;
		System.out.println("Secret Key for the Ramesh is :"+Rk);
		
		Sk=Math.pow(R, b)%p;
		System.out.println("Secret Key for the Suresh is :"+Sk);
		
	}
    public static boolean check(int num)
	{
    	int flag=0;
    	for(int i=2;i<num;i++)
	    {
	    	
	    	if(num%i==0)
	    	{
	    		System.out.println("Not prime number :");
	    		flag=1;
	    		break;
	    	}
	    }
	    	if(flag==0)
	    	{
	    		System.out.println("prime number :");
	    	}
	    	else {
	    		System.out.println("enter Only prime no");
	    	}
			return true;
       
	}
}
