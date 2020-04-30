package ArrayPrograms;

import java.util.Scanner;

public class Max_FirstTwo_Array {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
				Scanner sc=new Scanner(System.in);
				System.out.println("enter the size of an array ");
				int size=sc.nextInt();
				int max1,max2;
				int [] ar=new int[size];
				for(int i=0;i<ar.length;i++)
				{
					System.out.println("enter the value for "+i);
					ar[i]=sc.nextInt();
				}
				max1=ar[0];
				max2=ar[1];
				max(ar,max1,max2);
	}
	public static void max(int[] ar,int max1,int max2)
	{
		int index1=0;
		int index2=0;
		for(int i=1;i<ar.length;i++)
		{
			if(ar[i]>max1) 
			{
				max2=max1;
				max1=ar[i];
			}
			else if(max2<ar[i])
			{
				max2=ar[i];
			}
		}
		System.out.println("the max value is "+max1+" "+max2 );
	
	}
	

}
