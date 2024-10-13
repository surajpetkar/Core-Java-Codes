package timepass;
import java.util.Scanner;
public class starLadder
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		String s1=sc.nextLine();
		int num=Integer.parseInt(s1);
		for(int i=0;i<num;i++)
		{
			for(int j=1;j<=i;j++)
			{
			System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}
