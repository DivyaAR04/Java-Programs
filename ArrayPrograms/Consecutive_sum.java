

/* WAP to determine biggest consecutive sum of elements in an 
 * array
 */
package ArrayPrograms;

import java.util.Scanner;

public class Consecutive_sum 
{
/*
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int[] ar= {12,4,25,3,2};
		int sum=ar[0]+ar[1];
		for(int i=0;i<ar.length-1;i++)
		{
			if(sum<(ar[i]+ar[i+1]))
			{
			sum=ar[i]+ar[i+1];
			}
			
		}
		System.out.println(sum +"Is the biggest consecutive number");
	}*/
	
	public static void main(String[] args)
	{
		System.out.println("Enter the size of an array");
		int size;
		Scanner sc=new Scanner(System.in);
		size=sc.nextInt();
		int[] ar=new int[size];
		int bigsum=ar[0]+ar[1];
		for(int i=1;i<ar.length;i++)
		{
			
		}
		
		
	}
	
	
	
}