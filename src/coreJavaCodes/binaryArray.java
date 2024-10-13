package timepass;
import java.util.Scanner;
public class binaryArray 
{
	public static void main(String args[])
	{
		int a=0,b=0,num,size;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size:");
		size=sc.nextInt();
		int arr[]=new int[size];
			for(int i=0;i<size;i++)
			{	
			num=sc.nextInt();
			if(num==1 || num==0)
			{
				arr[i]=num;
			}
			else 
			{
				System.out.println("Enter binary Only");
				break;
			}
			}
			for(int i=0;i<size;i++)
			{
				if(arr[i]==1)
				{
					b=i;
					if(b>a)
					{
						a=b;
					}
				}
			}
			System.out.print(""+a);	
	}	
}
