package timepass;
import java.util.*;

public class lcm {
	public static Vector<Integer> v =new Vector<Integer>();
	static int lm=0;
	public static void main(String args[])
	{
		lcm l = new lcm();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter two num:");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int hcf;
		
		l.fac(n1,0,1);
		l.fac(n2, 2, 3);
		Collections.sort(v);
		System.out.println(v);
		
		hcf=l.equ(v);
		l.lcmm(v);
		
	    System.out.println("HCF "+hcf);
		
		
	}
	public void fac(int n,int i1,int i2)
	{
		for(int i=2;i<=(n/2);i++)
		{
			for(int j=2;j<(n/2);j++)
			{
				if(n==i*j)
				{
				  v.add(i1, i);
				  v.add(i2, j);
				//System.out.println(i+" "+j);
				 return;
				}
				
			}
		}
	}
	public int equ(Vector v1)
	{
		for(int i=0;i<v1.size();i++)
		{
			for(int j=1;j<v1.size();j++)
			{
				if(i!=j)
				{
				 if(v1.elementAt(i).equals(v1.elementAt(j)))
				 {
				 return (int) v1.get(i);
				 }
				}
			}
		}
		return 0;
	}

	public void lcmm(Vector v1)
	{
		for(int i=0;i<v1.size();i++)
		{
			for(int j=1;j<v1.size();j++)
			{
				if(i!=j)
				{
				 if(v1.elementAt(i).equals(v1.elementAt(j)))
				 {
				  v1.remove(i);
				 }
				}
			}
		}
		int b=1;
		for(int i=0;i<v1.size();i++)
		{
			b= b* (int)v1.get(i);
		}
		System.out.println("LCM "+b);
	}
 		

}

