package javaPractice;

public class Sum_of_first_3_StrongNo 
{
	public static int factor(int r)
	{
		int fact=1;
		for(int i=1;i<=r;i++)
		{
			fact=fact*i;
		}
		return fact;
	}
	
	public static void isStrong(int num)
	{
		int r=0;
		int strong=0;
		int copy=num;
		while(num!=0)
		{
			r=num%10;
			strong=strong + factor(r);
			num=num/10;
		}
		
		if(strong==copy)
		{
			System.out.println("strong number is "+strong);
			int sum=0;
			for(int count=1;count<=3;count++)
			{
				
			}
		}	
	}
	
	public static void strong(int num)
	{
		for(int i=1;i<num;i++)
		{
			isStrong(i);
		}
		
	}
	
	public static void main(String[] args)
	{
		strong(100000);
	}

}
