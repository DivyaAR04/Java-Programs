package com.Pattern.Practice;

public class Pattern14 {
	public static void main(String[] args) 
	{
		for(int i=4;i>=1;i--)
		{
			for(int j=4;j>=1;j--)
			{
				if((i==4)||(i==1)||(j==4)||(j==1))
					{
						System.out.print("*");
					}
				System.out.print("\t");
			}
			System.out.println();
		}
	}
}
/* **********OUTPUT************
*	*	*	*	
*			*	
*			*	
*	*	*	*	

*/ 
