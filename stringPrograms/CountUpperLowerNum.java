package stringPrograms;

import java.util.Scanner;

public class CountUpperLowerNum {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String str="";
		Scanner sc=new Scanner(System.in);
		str=sc.nextLine();
		CountChars(str);
	}

	private static void CountChars(String str) 
	{
		// TODO Auto-generated method stub
		int ucount=0,lcount=0,ncount=0,scount=0;
		for(int i=0;i<str.length();i++)
		{	char ch=str.charAt(i);
			if(ch>='A' && ch<='Z')
			{
				ucount++;
			}
			else if(ch>='a' && ch<='z')
			{
				lcount++;
			}
			else if(ch>='0' && ch<='9')
			{
				ncount++;
			}
			else
			{
				scount++;
			}
		}
		System.out.println(ucount);
		System.out.println(lcount);
		System.out.println(ncount);
		System.out.println(scount);
	}

}
