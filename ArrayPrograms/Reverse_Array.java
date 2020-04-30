package ArrayPrograms;

import java.util.Scanner;

public class Reverse_Array {

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
	   for(int i=size-1,j=0;i>=0;i--,j++)
		{
			ar1[j]=ar[i];
			System.out.println(ar1[j]);
		}
		
		
	/*	System.out.println("Enter the size of an array");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int ar[]= new int[size];
		int ar1[]=new int[size];
		System.out.println("Enter value for array");
		for (int i=0;i<size;i++)
		{
			ar[i]=sc.nextInt();
		}
		reverse(ar,ar1);
	}

	private static void reverse(int[] ar, int[] ar1) 
	{
		// TODO Auto-generated method stub
		for(int i=size-1)
	}*/
	}
}
