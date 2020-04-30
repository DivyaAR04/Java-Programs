package ArrayPrograms;

import java.util.Scanner;

public class Min_2_Numbers 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of an array ");
		int size=sc.nextInt();
		int min1,min2;
		int [] ar=new int[size];
		for(int i=0;i<ar.length;i++)
			{
				System.out.println("enter the value for "+i);
				ar[i]=sc.nextInt();
			}
		min1=ar[0];
		min2=ar[1];
		minimum(ar,min1,min2);
	}
	public static void minimum(int[] ar,int min1,int min2)
	{
		for(int i=1;i<ar.length;i++)
		{
		  if(ar[i]<min1) 
			{
			  min2=min1;
			  min1=ar[i];
			}
		  else if(min2>ar[i])
			{
			  min2=ar[i];
			}
		}
		System.out.println("the max value is "+min1+" "+min2 );
		
	}
}

