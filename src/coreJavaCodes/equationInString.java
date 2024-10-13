package timepass;
import java.util.*;

public class equationInString {
public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
	char a[]=new char[20];
	int i;
	String s1;
	System.out.print("enter equation");
	s1=sc.nextLine();
	for(i=0;i<s1.length();i++)
	{
	a[i] = s1.charAt(i);
	}
	for(i=0;i<s1.length();i++)
	{
		System.out.print(a[i]+" "+i );
	}
}

}
