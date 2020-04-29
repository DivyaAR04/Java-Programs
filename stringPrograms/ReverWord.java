package stringPrograms;

import java.util.Scanner;

public class ReverWord {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String str="";
		Scanner sc=new Scanner(System.in);
		str=sc.nextLine();
		String str1=reversWordstr(str);
		System.out.println(str1);
		reversChar(str);
	}

	private static void reversChar(String str)
	{
		// TODO Auto-generated method stub
		int count=0;
		count=str.length();
		String rev=" ";
		for(int i=count-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);
	}

	private static String reversWordstr(String str) 
	{
		// TODO Auto-generated method stub
		System.out.println(str);
		String[] s2;
		String rev=" ";
		s2=str.split(" ");
		for(int i=s2.length-1;i>=0;i--)
		{
			rev=rev+" "+s2[i];
		}
			
		return rev.trim();
	}

}
