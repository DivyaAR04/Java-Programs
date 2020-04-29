package stringPrograms;

import java.util.Scanner;

public class SeparateCharAlpha {
// Program to separate digit,alphabet,special characters
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String str="";
		Scanner sc=new Scanner(System.in);
		str=sc.nextLine();
		System.out.println(str);
		separate(str);
	}

	private static void separate(String str) 
	{
		// TODO Auto-generated method stub
		StringBuffer num=new StringBuffer(), chare=new StringBuffer(),spe=new StringBuffer();
		int size=str.length();
		for(int i=0;i<size;i++)
		{
			if(Character.isDigit(str.charAt(i)))
			{
				num.append(str.charAt(i));
			}
			else if(Character.isAlphabetic(str.charAt(i)))
			{
				chare.append(str.charAt(i));
			}
			else
			{
				spe.append(str.charAt(i));
			}
		}
		System.out.println(num);
		System.out.println(chare);
		System.out.println(spe);
	}

}
