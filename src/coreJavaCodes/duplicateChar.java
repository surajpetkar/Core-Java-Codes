package coreJavaCodes;
import java.util.*;

public class duplicateChar
{
 static	String removeduplicate(String st)
 	{
	 Set<Character> s=new HashSet<Character>();
	 String res="";
	 	for(int i=0;i<st.length();i++)
	 	{
		char ch=st.charAt(i);
		
			if(s.contains(ch)) {}
			else
			{	
			s.add(ch);
			res+=Character.toString(ch);
			}
	 	}
	 	return res;
 	}
	
	public static void main(String args[])  
	{
	Scanner sc=new Scanner(System.in);
	String st=sc.nextLine();
	String res=removeduplicate(st);
	System.out.println(res);
	}

}
