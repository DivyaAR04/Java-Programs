package stringPrograms;
// program should pring hello to you as olleh ot uoy
public class ReverseCharInWordStrBuilder {
	
	

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		reverseChar("Hello to you");
	
	}

	private static void reverseChar(String str1)
	{
		// TODO Auto-generated method stub
		String[] str2=str1.split("");
		
		int count=str2.length;
		System.out.println(str2[0]);
		for(int i=0;i<count;i++)
		{
			System.out.print(str2[i]);
			System.out.print("\t");
		//	StringBuilder str3=new StringBuilder(str2[i]);
			//System.out.print(str3.reverse());
			
			
		}
		
		
		
		
		
		
		
		
		
	/*	for(String w:str2)
		{	//StringBuilder rev;
			StringBuilder sb=new StringBuilder(w);
			//rev=new StringBuilder(sb.reverse());
			System.out.println(sb.reverse());
			
			//rev=sb.reverse();
			//reverseWord=reverseWord+rev.toString();
		}
		//System.out.println(reverseWord);*/
		
		
	}

}
