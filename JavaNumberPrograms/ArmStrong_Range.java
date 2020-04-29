package javaPractice;

public class ArmStrong_Range 
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
			sum_Of_Range(4);
			rangeArmStrong(10000);	
		}	
		private static void sum_Of_Range(int ra) 
		{
			// TODO Auto-generated method stub
			int counter=1;
			int sum=0;
			for (int i = 1;counter<=ra; i++) 
			{
				boolean res=isArmStrong(i);
				if(res==true)
				{
					counter++;
					sum=sum+i;
				}
		   }	
			System.out.println(sum + " is sum of first "+ ra +" numbers");
		}
		
		private static void rangeArmStrong(int num) 
		{
			// TODO Auto-generated method stub
			boolean flag=true;
			for(int i=1;i<=num;i++)
			{
			  flag=isArmStrong(i);
			  if(flag==true)
		        {
		      	  System.out.println("The prime number is "+i);
			    }
		    }	
	    }
}
/******************OUTPUT****************
 * 10 is sum of first 4 numbers
The prime number is 1
The prime number is 2
The prime number is 3
The prime number is 4
The prime number is 5
The prime number is 6
The prime number is 7
The prime number is 8
The prime number is 9
The prime number is 153
The prime number is 370
The prime number is 371
The prime number is 407
The prime number is 1634
The prime number is 8208
The prime number is 9474
*/



