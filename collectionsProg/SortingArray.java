package collectionsProg;

import java.util.Arrays;

public class SortingArray 
{
	public static void main(String[] args)
	{
		int a[]= {10,20,5,3,2,1,30};
		int size=a.length;
		Arrays.sort(a);
		
		for(int i=0;i<size;i++)
		{
			System.out.println(a[i]);
		}
	}
	
}
