package ArrayPrograms;

import java.util.Scanner;

public class Reverse_Array_2nd_Approch {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.out.println("Enter the size of an array");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int ar[]= new int[size];
		System.out.println("Enter value for array");
		for (int i=0;i<size;i++)
		{
			ar[i]=sc.nextInt();
		}
		int size1=ar.length;
		for(int i=0,j=(size1-1);i<ar.length/2;i++,j--)
		{
			int temp=ar[i];
			ar[i]=ar[j];
			ar[j]=temp;
			
		}
		for(int i=0;i<ar.length;i++)
		{
			System.out.println(ar[i]);
		}
		
	}

}
