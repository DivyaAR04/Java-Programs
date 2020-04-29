package javaPractice;

public class Prime_Range 
{
	public static void primeRen(int num)
	{	
		for(int i=2;i<=num;i++)
		{
		   primeNot(i);
        }
	}
	public static void primeNot(int num1)
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
		  
        if(flag==true)
        {
      	  System.out.println("The prime number is "+num1);
        }
    }
		
    public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		primeRen(100);
	}
}

/************************OUT PUT**********************
 * The prime number is 2
The prime number is 3
The prime number is 5
The prime number is 7
The prime number is 11
The prime number is 13
The prime number is 17
The prime number is 19
The prime number is 23
The prime number is 29
The prime number is 31
The prime number is 37
The prime number is 41
The prime number is 43
The prime number is 47
The prime number is 53
The prime number is 59
The prime number is 61
The prime number is 67
The prime number is 71
The prime number is 73
The prime number is 79
The prime number is 83
The prime number is 89
The prime number is 97
*/
