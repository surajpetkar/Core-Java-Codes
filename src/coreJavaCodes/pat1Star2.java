package coreJavaCodes;
import java.util.*;
public class pat1Star2 
{

	public static void main(String args[]) 
	{
		int row,col,num=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of rows:");
		row=sc.nextInt();
		System.out.println("Enter number of column:");
		col=sc.nextInt();
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<=i;j++)
			{	
				System.out.print(num+" ");
				num++;
			}
			
				System.out.println("");
	     }
	}

}
