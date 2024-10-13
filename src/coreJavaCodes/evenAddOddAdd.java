package coreJavaCodes;
import java .util.*;
public class evenAddOddAdd 
{

	public static void main(String args[])
	{
		int even=0,odd=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		System.out.println("----------------");
		int arr[]=new int[num];
  	    for(int i=0;i<num;i++)
  	    {
  	    	String str=sc.nextLine();
  	    	int no=Integer.parseInt(str);
  	    }
  	    for(int i=0;i<num;i++)
  	    {
  		if(i%2==0)
	    	{
	    		odd=odd+arr[i];	
	    	}
  		else
  			even=even+arr[i];
  		
  	    }
  	  System.out.println("ODD Position :"+odd);
  	  System.out.println("EVEN Position :"+even);
	}
}
