package timepass;
import java.util.*;

public class tillMinusOne {

	public static void main(String args[])
	{   
		int num=0;
		Vector <Integer> v=new Vector(); 
		Scanner sc= new Scanner(System.in);
		System.out.println("enter num:");
		while(num!=-1)
		{
			v.add(num);
			num=sc.nextInt();
		}
		Collections.sort(v);
		System.out.println(""+v);
	}

}
