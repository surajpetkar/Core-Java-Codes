package coreJavaCodes;
import java.util.*;
public class add4digit 
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	int m;
	int add=0;
	System.out.println("Enter four digit number:");
    String st=sc.nextLine();
    int num=Integer.parseInt(st);
    while(num>0)
    {
      m=num%10;
      add=add+m;
      num=num/10;
    }
    System.out.println("Sum of digits:"+add);
}
}
