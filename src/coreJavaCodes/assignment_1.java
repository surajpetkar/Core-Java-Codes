package coreJavaCodes;

import java.util.Scanner;
import java.io.*;
public class assignment_1
{
	public static void main(String args[])
	{
		int a[] =new int[10];
	    int mun1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int num=sc.nextInt();
		for(int i=0;i<num;i++)
		{	
		a[i]=sc.nextInt();
		}
		for(int i=0;i<num;i++)
		{
		System.out.print(a[i]);
        } 
	}
}