package javaPractice;

public class Armstrong_Num_Range 
{
	public static int power(int num,int count)
	{
		int result=1;
		for(int i=1;i<=count;i++)
		{
			result=result*num;
		}
		return result;
	}
	public static int countNumberOfdigit(int num)
	{
		int count=0;
		while(num!=0)
		{
			num=num/10;
			++count;
		}
		return count;
	}

	public static boolean isArmStrong(int num)
	{
		int out=0;
		int temp=num;
		int digit=countNumberOfdigit(num);
		while(num!=0)
		{
			int rem=num%10;
			out=out+power(rem,digit);
			num=num/10;
		}
		return temp==out;
	}

		
		public static void main(String[] args) 
		{
			// TODO Auto-generated method stub
		//	int num=153;
		//	boolean flag=false;
			 for (int n = 1; n < 10000; n++) 
	         {  
				 rangeArmStrong(n); 
		     }
		}	
		private static void rangeArmStrong(int num) 
		{
			// TODO Auto-generated method stub
			if(isArmStrong(num)) 
	            {
	        	 System.out.println(num+" given number is armstrong number");
	            }			
	    }
}
