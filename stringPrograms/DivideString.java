package stringPrograms;

public class DivideString {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		StringBuffer str=new StringBuffer("hello_world");
		StringBuffer str1=new StringBuffer();
		StringBuffer str2=new StringBuffer();
		int leng=str.length();
		System.out.println(leng);
		int f=leng/2;
		System.out.println(f);
		int s=leng-f;
		System.out.println(s);
		
		for(int i=0;i<f;i++)
		{		
			str1=str1.append(str.charAt(i));
		}
		int st=f+1;
		for(int i=st;i<s;i++)
		{
			System.out.println(i);
			System.out.println(str.charAt(i));
			str2=str2.append(str.charAt(i));
		}
		
		System.out.println(str1);
		System.out.println(str2);
	}

}
