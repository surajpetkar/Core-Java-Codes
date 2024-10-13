package coreJavaCodes;
import java.util.*;

public class arrayCheck {

	public static void main(String args[])
	{
		int num;
		boolean flag = false;
		Scanner sc=new Scanner(System.in);
		System.out.println("How many element do you want to enter:");
		num=sc.nextInt();
		System.out.println("enter "+num+" elements:");
		int arr[] = new int[num];
		for(int i=0;i<num;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<num;i++)
		{
			for(int j=i+1;j<num;j++)
			{
				if(arr[i]>arr[j])
				{
					flag=true;
					j++;
				}
				else
			{
					i++;
					j++;
					break;
				}
			}
			if(flag=true)
			{
				System.out.println("==>"+arr[i]);
			}
		}
	}
}
