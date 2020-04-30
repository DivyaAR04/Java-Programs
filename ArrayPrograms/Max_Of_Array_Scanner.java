package ArrayPrograms;

import java.util.Scanner;

public class Max_Of_Array_Scanner
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of an array ");
		int size=sc.nextInt();
		int max;
		int [] ar=new int[size];
		for(int i=0;i<ar.length;i++)
		{
			System.out.println("enter the value for "+i);
			ar[i]=sc.nextInt();
		}
		max=ar[0];
		System.out.println(max);
		max(ar,max);
	
	
	
	
	
	
	}
	
	public static void max(int[] ar,int max)
	{
		int index=0;
		for(int i=1;i<ar.length;i++)
		{
			if(max<ar[i])
			{
				max=ar[i];
				index=i;
			}
		}
		System.out.println("the max value is "+max+ "it is present in "+index );
	
	}

}

/* scanner class is used to accept the value from user through console.
 * it is located in util class
 * 
 * next.Int()=> is used to accept Integer value entered by user
 * next.double()=>
 * next.next()=> for accepting string from user
 * 				e.g.: this is string. here only str='this' is stored 
 * next.nextLine()=>to accept the complete line
 *                  e.g.:str= this is string will be stored in strinng
 */                  
