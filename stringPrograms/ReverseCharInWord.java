package stringPrograms;
// program to reverse characters in each word
// "hello to you" should be printed as "olleh ot uoy"
public class ReverseCharInWord {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String str1="hello to you";
		String[] str2;
		str2=str1.split(" ");
		String revstr=" ";
				
		for(String dummy:str2)
		{
			int len=dummy.length();
			for(int i=len-1;i>=0;i--)
			{
				revstr=revstr+dummy.charAt(i);
			}
			revstr=revstr+" ";
		}
		System.out.println(revstr);
	}

}
