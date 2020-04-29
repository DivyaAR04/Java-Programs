package javapractice;

public class LCD_Recursion 
{
	public static int LCM_Rec(int a,int b)
	{
		int max=((a>b)?a:b);
		int temp=max;
		
		while(true)
		{
		if(max%a==0 && max%b==0)
		   {
			return max;
		    }
			  max=max+temp;
		      return LCM_Rec(a,b);
		}
	}
	
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		int a=3,b=5;
		System.out.println("the LCM is " +LCM_Rec(a,b));
	}
}
