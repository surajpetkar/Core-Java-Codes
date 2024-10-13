package timepass;
import java.util.*;

public class square {

	public static void main(String[] args) {
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the rows and columns");
		a=sc.nextInt();
		b=sc.nextInt();
		for(int i=a;i>=1;i--)
		{
			
			for(int j=1;j<=b;j++)
			{
				System.out.print(j+" ");
			} 
			System.out.println();
			for(int j=b;j>=1;j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
			
		}
	}

}
