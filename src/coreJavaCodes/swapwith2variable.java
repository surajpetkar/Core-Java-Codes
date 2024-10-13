package coreJavaCodes;
import java.util.*;
public class swapwith2variable {

	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		int a,b;
		System.out.println("Enter first value:");
		a=sc.nextInt();
		System.out.println("Enter Second value:");
		b=sc.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a==>"+a+"\nb==>"+b);
	}

}
