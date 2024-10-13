package timepass;
import java.util.*;
public class palindrome 
{
	public static void main (String args[])
	{
    Scanner sc = new Scanner(System.in);	
    String a,b;
    StringBuffer sb;
    System.out.println("Enter any string: ");
    a = sc.nextLine();
    sb = new StringBuffer(a);
    b= sb.reverse().toString();
    if(a.equals(b))
    {
    	System.out.println("String is palendrome");
    }
    else {
    	System.out.println("String is not palendrome");
    }
    	
	}
}
