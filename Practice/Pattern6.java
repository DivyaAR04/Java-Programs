package com.Pattern.Practice;

public class Pattern6 
{
	public static void main(String[] args) 
	{
		for(int i=4;i>=1;i--)
		{
			for(int j=4;j>=1;j--)
			{
				if(i%2!=0)
				{
					System.out.print(j);
				}
				else
				{
					System.out.print(i);
				}
			}
			System.out.println();	
		}
		
	}

}
/* ******OUT PUT********
 4444
4321
2222
4321
*/
