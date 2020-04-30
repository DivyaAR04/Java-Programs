package ArrayPrograms;

import java.util.Scanner;

// WAP to find first 3 min numbers
public class Min_3_Numbers {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("Enter the size of array ");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		
		int[] ar=new int[size];
		for(int i=0;i<ar.length;i++)
		{
			System.out.println("enter the value for "+i);
			ar[i]=sc.nextInt();
		}
		small_Three_no(ar,size);
	}

	private static void small_Three_no(int[] ar, int size) 
	{
		// TODO Auto-generated method stub
		int min1=ar[0];
		int min2=ar[1];
		int min3=ar[2];
		
		for(int i=1;i<size;i++)
		{
			if(ar[i]<min1)
			{
				min3=min2;
				min2=min1;
				min1=ar[i];
			}
			else if(ar[i]<min2)
			{
				min3=min2;
				min2=ar[i];
			}
			else if(ar[i]<min3)
			{
				min3=ar[i];
			}
		}
		System.out.println("First minimum "+min1+"Second minimum "+min2+"Third minimum "+min3);
	}
}

/***********************OUT PUT*******************
 *Enter the size of array 
5
enter the value for 0
8
enter the value for 1
10
enter the value for 2
20
enter the value for 3
4
enter the value for 4
2
First minimum 2Second minimum 4Third minimum 8

 */
