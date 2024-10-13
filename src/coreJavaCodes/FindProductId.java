package coreJavaCodes;

import java.util.Scanner;

public class FindProductId
{
	public int calId(char[] productID)
	{
		int answer = 0;
		String s1 = "aeiou";
		char[] calID = s1.toCharArray();
		for(int i=0;i<productID.length;i++)
			System.out.println(calID[i]);
	return answer;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char[] productID = new char[n];
		System.out.println("asdh");
		for(int i=0;i<=n;i++)
		{
			String s = sc.next();
			productID[i] = s.charAt(i);
		}
		FindProductId fpi = null;
		fpi.calId(productID);
	}
}
