
public class LCM_Recursion 
{
	public static void isLCM(int a,int b,int max, int temp)
	{
		if(true)
		{
			if(max%a==0 && max%b==0)
			{
				System.out.println(max);
				return;
			}
			max=max+temp;
			isLCM(a,b,max,temp);
		}
		
	}

	
	
	
	public static void main(String[] args)
	{
		int a=5,b=10;
		int max=(a>b)?a:b;
		int temp=max;
		isLCM( a, b, max, temp);
		//System.out.println("LCM of the given number "+lcm);
	}

}
