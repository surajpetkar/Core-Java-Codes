package coreJavaCodes;
import java.io.*;

public class reverse {

	public static void main(String args[]) throws IOException
	{
		int num,rev;
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter five digit number:");
		String st=br.readLine();
		num=Integer.parseInt(st);
		while(num>0)
		{
			rev=num%10;
			System.out.print(""+rev);
			num=num/10;
		}
	}

}
