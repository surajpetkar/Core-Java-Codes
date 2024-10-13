package coreJavaCodes;

import java.util.Scanner;

public class pattern123 {
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
		System.out.print("1");
		for(int j=num1;j<=num1;j++)
		{
		System.out.print("2");
		System.out.print("3");
		}
		
		System.out.print("\n");
	}
	}


}
