package com.Pattern.Practice;

public class Pattern8 
{
	public static void main(String[] args) 
	{
	  for(int i=4;i>=1;i--)
	  {
		  for(int j=4;j>=1;j--)
		  {
			  if(i%2==0)
			  {
				  System.out.print(j);
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
/* ************OUT PUT************
4321
****
4321
**** */