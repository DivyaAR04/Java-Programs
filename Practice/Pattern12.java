package com.Pattern.Practice;

public class Pattern12 {
	public static void main(String[] args) 
	{
		for(int i=4;i>=1;i--)
		{
			for(int j=1;j<=4;j++)
			{
				if(i%2==0)
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
/* *******OUT PUT********
****
1234
****
1234
*/
