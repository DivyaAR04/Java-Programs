package ArrayPrograms;

import java.util.Scanner;

public class Reverse_Array_ByKarthik 
{	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("Enter the size of an array");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int ar[]= new int[size];
		int ar1[]=new int[size];
		System.out.println("Enter value for array");
		for (int i=0;i<size;i++)
		{
			ar[i]=sc.nextInt();
		}
		ar1=reverse(ar);
		boolean flag=true;
		for(int i=0,j=0;i<size;i++,j++)
		{
			if(ar[i]!=ar1[j])
			{
				flag=false;
				break;
			}
		}
		if(flag==true)
		{
			System.out.println("array is palindrom");
		}
		else
		{
			System.out.println("array not palindrom");
		}
	}

	private static int[] reverse(int[] ar)
	{
		// TODO Auto-generated method stub
		int[] ar1=new int[ar.length];
		int j=0;
		for(int i=ar.length-1;i>=0;i--)
		{
			ar1[j++]=ar[i];
		}
		return ar1;
	}

}
