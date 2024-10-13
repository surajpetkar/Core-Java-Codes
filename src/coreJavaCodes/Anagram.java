package coreJavaCodes;

import java.util.Scanner;
public class Anagram 
{

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int i=0,j=0;
		System.out.println("Enter the first String:");
		String str=sc.nextLine();
		System.out.println("Enter the second String:");
		String str1=sc.nextLine();
		char ar[],arr[];
		ar=str.toCharArray();
		arr=str1.toCharArray();
		System.out.println(ar);
		System.out.println(arr);
		for(i=0;i<=ar[10];i++)
		{
			for(j=0;j<=arr[10];j++)
			{
				if(ar[i]==arr[j])
				{
					i++;
					j++;
					
				}
				else
				{
				 i++;
				}
				
			}
		}
		if(ar[i]==arr[j])
		{
			System.out.println("Anagram");
		}
	}
}	
