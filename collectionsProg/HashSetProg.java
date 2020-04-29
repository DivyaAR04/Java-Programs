package collectionsProg;

import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class HashSetProg {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String[] str1= {"Divya","Viprava","Krupa","Kruti","Siri","Lohita","Viprava"};
		HashSet<String> str=new HashSet<String>();
	   /*for(int i=0;i<10;i++)
		{
		Scanner sc=new Scanner(System.in);
		str1[i]=sc.nextLine();
		}*/
		for(int i=0;i<str1.length;i++)
		{
			 str.add(str1[i]);	
		}
		int count=str.size();
			System.out.println(str);
	}

}
