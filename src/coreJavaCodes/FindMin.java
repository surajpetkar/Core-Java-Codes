package coreJavaCodes;

public class FindMin {

	public static void main(String[] args) {
		
		int[] arr = {3,9,4,6,8,1,7,3};
		int min = arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min)            // for max ==>  if(arr[i]>max)
				min = arr[i];
		}
		System.out.println(min);
	}

}
