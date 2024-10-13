import java.util.ArrayList;
import java.util.Scanner;
public class arraylist 
{ 
	public static void main(String args[])
	{
		ArrayList<Integer> al = new ArrayList<Integer>();
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first row:");
		int num = sc.nextInt();
		for(int i=0;i<num;i++)
		{
			al.add(sc.nextInt());
		}
		System.out.println("Enter Second row:");
		int num1 = sc.nextInt();
		for(int i=0; i<num1 ; i++)
		{
			al1.add(sc.nextInt());
		}
		if(al.equals(al1))
		{
			System.out.print(al);
		}		
	}
}
