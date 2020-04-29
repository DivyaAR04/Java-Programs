package stringPrograms;

public class StringStarts {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String[] str=new String[] {"java welcome","slenium welcome","// hello","c progr" };
		
		int count=0;
		int lcount=0;
		
		for(String str1:str)
		{
		count++;
		lcount++;
		
			if(str1.startsWith("//"))
			{
				System.out.println("found at line number "+count);
			}	
			if(str1.endsWith("progr"))
			{
				System.out.println("found at line number "+lcount);
			}
			
		}
	}

}
