package collectionsProg;

import java.util.TreeSet;

public class TreeSetProg {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String[] str1= {"Divya","Viprava","Krupa","Kruti","Siri","Lohita","Viprava"};
		TreeSet<String> str=new TreeSet<String>();
	  
		for(int i=0;i<str1.length;i++)
		{
			 str.add(str1[i]);	
		}
		int count=str.size();
			System.out.println(str);
	}
	}

