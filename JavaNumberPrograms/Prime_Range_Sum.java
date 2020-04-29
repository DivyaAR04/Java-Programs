package javaPractice;

public class Prime_Range_Sum 
{
	public static void primeRen(int num)
	{
		boolean flag=true;
		for(int i=2;i<=num;i++)
		{
		  flag=primeNot(i);
		  if(flag==true)
	        {
	      	  System.out.println("The prime number is "+i);
		    }
        }
	}
	
	public static boolean primeNot(int num1)
	{
		boolean flag=true;
		for(int j = 2; j <=num1/2; j++)
          {
           if(num1 % j == 0)
            {
          	  flag=false;
              break;
             }
          }
		return flag;
	}
		
   
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		sumOfPrime(4);
		primeRen(100);
	}

	private static void sumOfPrime(int ra) 
	{
		// TODO Auto-generated method stub
		int counter=1;
		int sum=0;
		for (int i = 2;counter<=ra; i++) 
		{
			boolean res=primeNot(i);
			if(res==true)
			{
				counter++;
				sum=sum+i;
			}
		}
		System.out.println(sum);
	}
}
