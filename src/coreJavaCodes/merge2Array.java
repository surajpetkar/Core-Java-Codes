package timepass;

public class merge2Array {
public static void main(String args[])
{
	int c1=0,c2=0,c3=0;
	
	int a1[]={1,4,2,5};
	int a2[]={8,3,6,7};
	int a3[]=new int[7];
	for(int i=0,j=0;i<4 && j<2;i++,j++)
	{
		System.out.print(a1[i]);
		System.out.print(a2[j]);
	}
	for(int i=0;i<4;i++)
	{
		c1++;
	}
	for(int j=0;j<2;j++)
	{
		c2++;
	}
	c3=c1<c2?c1:c2;
	for(int i=c3;i<4;i++)
	{
     System.out.print(a1[i]);
	}
	
	
	//System.out.print(c3);
}
}
