package timepass;
import java.util.*;

public class repeatWord {
	public static void main(String args[])
{
  Scanner sc = new Scanner(System.in);
  HashMap<String,Integer> hm = new HashMap<>();
  System.out.println("Enter");
  String str = sc.nextLine();
  String[] word = str.split(" ");
  int count;
  for(int i=0;i<word.length;i++)
  {
	  count=1;
	 for(int j=i+1;j<word.length;j++)
	 {
		 if(word[i].equals(word[j]))
		 {
			 count=count+1;
			 word[j]="";
		 }
	 }
		 hm.put(word[i],count);  
  }
  System.out.print(hm);
 }
}
