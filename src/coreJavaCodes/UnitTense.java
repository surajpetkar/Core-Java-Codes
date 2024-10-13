package coreJavaCodes;
import java.util.*;

public class UnitTense {
	public static void main(String args[])
	{
		
		Scanner sc = new Scanner(System.in);
		int num;
		int arr[]=new int[5];
		System.out.println("Enter Numbers:");
		for(int i=0;i<5;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=4;i>0;i--)
		{
			num=arr[i]*10;
			for(int j=0;j<5;j++)
			{
				System.out.println(num);
				num++;
			}
		}
		
		
	}

}
