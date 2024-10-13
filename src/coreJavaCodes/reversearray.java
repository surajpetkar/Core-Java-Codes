package coreJavaCodes;
public class reversearray 
{
  public static void main(String args[]) 
	{
		int temp=0;
		int arr[]= {4,3,2,1};
		
		for(int i=0;i<4;i++)
		{
		for(int j=1;j<4;j++)
		{	

				if(arr[i]>=arr[j])
				{
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				}
				
			}
			System.out.println("==>"+arr[i]);
		}
	}

}
