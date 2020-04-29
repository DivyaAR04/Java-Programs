package com.Pattern.Practice;

public class Pattern9 
{
	public static void main(String[] args) 
	{
		for(int i=4;i>=1;i--)
		{
			for(int j=4;j>=1;j--)
			{
			  if(i%2==0)
			     {
			       System.out.print(i);
			     }
			  else
			  	{
				  System.out.print("*");
			  	}
		    }
			System.out.println();
		}
	}
}
/* ******OUT PUT********
 4444
****
2222
****
*/
