package coreJavaCodes;
import java.util.Scanner;
public class pointercalculator
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	int a[],c[];
    a=new int[12];
    c=new int[12];
	System.out.println("Enter your CRD of one semister");
	for(int i=0;i<=9;i++)
	{
		c[i]=sc.nextInt();
		System.out.println(" "+c[i]);
	}
	System.out.println("Enter your credit points of one semister");
	for(int i=0;i<=9;i++)
	{ 
	    a[i]=sc.nextInt();
	    System.out.println(" "+a[i]);
	}
	float crds=c[0]+c[1]+c[2]+c[3]+c[4]+c[5]+c[6]+c[7]+c[8]+c[9];
	float add=a[0]+a[1]+a[2]+a[3]+a[4]+a[5]+a[6]+a[7]+a[8]+a[9];
	System.out.println("Addition of credit points: "+add);
	System.out.println("POINTER IS: "+(add/crds));
}
}
