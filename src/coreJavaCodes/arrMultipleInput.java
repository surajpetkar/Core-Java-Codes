package coreJavaCodes;
import java.io.*;

public class arrMultipleInput {

	public static void main (String args[]) throws IOException
   {
    int num;
    int a[]=new int[100];
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    System.out.println("How many number do you want to take in array:");
    num=Integer.parseInt(br.readLine());
    for(int i=0;i<num;i++)
    a[i]=Integer.parseInt(br.readLine());
        
    for(int i=0;i<num;i++) 
    System.out.println("==>"+a[i]);
   }
}
