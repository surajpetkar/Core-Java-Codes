package coreJavaCodes;
import java.util.Scanner;
public class areaofcircle {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter radius of circle:");
		String rad=sc.nextLine();
		int rd=Integer.parseInt(rad);
		System.out.println("Area of circle is:"+(3.14*rd*rd));
	
	}

}
