 package timepass;
import java.util.*;
public class rsa 
{
public static void main(String args[]) 
{
	Scanner sc=new Scanner(System.in);
	int a,b,n,pn,e,d=0,p;
	double P=0,C=0;
	System.out.println("Enter value of a:");
	a=sc.nextInt();
	check(a);
	System.out.println("Enter value of b:");
	b=sc.nextInt();
	check(b);
	n=a*b;
	System.out.println("n = "+n);
	pn=(a-1)*(b-1);
	System.out.println("pn = "+pn);
	System.out.println("Enter value of e");
	e=sc.nextInt();
	System.out.println("e = "+e);
	gcd(e,pn);
	for(int i=1;i<=100;i++)
	{
	d=((pn*i)+1)/e;
	if(((pn*i)+1)%e==0)
	{
	System.out.println("d = "+d);
	break;
	}
	}
	System.out.println("Public Key :("+e+","+n+")");
	System.out.println("Private Key :("+d+","+n+")");
	
	do
	{
	System.out.println("Enter value of Plain Text:");
	p=sc.nextInt();
	}while(P>n);
	C=Math.pow(p, e)%n;
	System.out.println("Encryption(Cipher Text) ="+C);
	
	P=Math.pow(C, d)%n;
	System.out.println("Decryption(Plain Text) ="+P);
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
			return true;     
	}
 
public static boolean gcd(int n1,int n2)
{
	 int gcd = 1;

     for(int i=1;i<=n1 && i<=n2;i++)
     {
         if(n1 % i==0 && n2 % i==0)
             gcd = i;
     }
     System.out.println("G.C.D of "+n1+" and "+n2+" is "+gcd);
	return true;
}
}
