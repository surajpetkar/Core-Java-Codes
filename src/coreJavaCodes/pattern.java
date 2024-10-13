package timepass;

import java.util.Scanner;

public class pattern 
{
	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Rows:");
	String s1=sc.nextLine();
	int num=Integer.parseInt(s1);
	System.out.println("Enter the Columns:");
	String s2=sc.nextLine();
	int num1=Integer.parseInt(s2);
	for(int i=num;i>=1;i--)
	{
		for(int j=1;j<=num1;j++)
		{
		System.out.print("*");
		}
		System.out.print("\n");
	}
	}
}
