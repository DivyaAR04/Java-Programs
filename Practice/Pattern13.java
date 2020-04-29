package com.Pattern.Practice;

public class Pattern13 
{
	public static void main(String[] args) 
	{
	  for(int j=4;j>=1;j--)
	  {
		  for(int i=4;i>=1;i--)
		  {
			  if(j%2==0)
			  {
				  System.out.print("*");
			  }
			  else
			  {
				  System.out.print(j);
			  }
		  }
		  System.out.println();
	  }
	}
}
/* *******OUT PUT******
****
3333
****
1111
*/