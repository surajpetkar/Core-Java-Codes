package timepass;

public class StringOccurence {
	
	public static void main(String[] args) {
		String s1 = "globaledge";
		String s2 = "learning";
		int count=0;
		char[] a1 = s1.toCharArray();
		char[] a2 = s2.toCharArray();
		for(int i=0;i<a1.length;i++)
		{
			for(int j=0;j<a2.length;j++)
			{
				if(a1[i]==a2[j])
				{
					count++;
				}
				else {
					break;
				}
			}
		}
		System.out.println(count);
	}
}
