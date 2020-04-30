package ArrayPrograms;
/* array given is L
 * size of array N
 * no of oepration to perform on Q
 * 1. insert value in index=>x
 * 2. delete the element in index=>x
 * 
 * input format
 * 1.N=5
 * 2.10 25 1 2 3
 * 3.Q
 * possibility
 * insert x y
 * delete x
 * 
 * 
 * sample e.g.
 * size is 5
 * array elements are 
 * 
 */

import java.util.Scanner;

public class Insert__at_given_index 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int index=2;
		int value=100;
		System.out.println("Enter the size of an array");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int ar[]= new int[size];
		System.out.println("Enter value for array");
		for (int i=0;i<size;i++)
		{
			ar[i]=sc.nextInt();
		}
		insert(ar,index,value);
	}

	private static void insert(int[] ar, int index, int value) 
	{
		// TODO Auto-generated method stub
		
		int nar[]=new int[ar.length+1];
		nar[index]=value;
		for(int i=0;i<index;i++)
		{
			nar[i]=ar[i];
		}
		for(int i=index+1;i<nar.length;i++)
		{
			nar[i]=ar[i-1];
		}
		System.out.println("The new array is");
		for(int i=0;i<nar.length;i++)
		{
			System.out.println(nar[i]);
		}

	}
}

/*********************OUTPUT******************
 * Enter the size of an array
5
Enter value for array
3
2
4
6
1
The new array is
3
2
100
4
6
1
*/
