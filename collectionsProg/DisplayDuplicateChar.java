package collectionsProg;

import java.util.HashMap;

public class DisplayDuplicateChar 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String str1="welcome to testyantra";
		HashMap<Character, Integer> hm=new HashMap<Character, Integer>();
		char c[] = str1.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			if(hm.containsKey(c[i]))
			{
				hm.put(c[i],hm.get(c[i])+1);
			}
			else
			{
				hm.put(c[i], 1);
			}
		
		}
		System.out.println(hm);
	}

}
