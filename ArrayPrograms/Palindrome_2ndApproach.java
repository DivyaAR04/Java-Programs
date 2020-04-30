package ArrayPrograms;

import java.util.Scanner;

public class Palindrome_2ndApproach {

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
				boolean flag=true;
				for(int i=0,j=(size1-1);i<ar.length/2;i++,j--)
				{
					if(ar[i]!=ar[j])
					{
						flag=false;
						break;
					}
				}
				if(flag==true)
				{
					System.out.println("the given array is palindrome");
				}
				else
				{
					System.out.println("the given array is not palindrome");
				}
				for(int i=0;i<ar.length;i++)
				{
					System.out.println(ar[i]);
				}
					
	}
	}
