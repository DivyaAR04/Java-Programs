package javaPractice;

public class Perfect_Num_sum 
{
	static boolean rangePerfect(int n) 
	{  
		boolean flag=false;
		flag=isPerfect(n);
		return flag;
	}	
	static boolean isPerfect(int num) 
	{  
	boolean flag=false;	
	int Sum = 0 ;
	for(int i = 1 ; i < num  ; i++) 
	{
		if(num % i == 0)  
		{
			Sum = Sum + i;
		}
	}
	if (Sum == num && num != 1) 
    { 
		flag=true;
	    return flag;
	  } 
	else
	{
        return flag; 
	}
}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		sum_Of_Perfect(2);
		
		for (int n = 2; n < 10000; n++) 
         {  if (rangePerfect(n)) 
            {
        	 System.out.println( n + "is a perfect number"); 
            }
	     }
	}
	private static void sum_Of_Perfect(int ra) 
	{
		// TODO Auto-generated method stub
		int counter=1;
		int sum=0;
		for (int i = 2;counter<=ra; i++) 
		{
			boolean res=isPerfect(i);
			if(res==true)
			{
				counter++;
				sum=sum+i;
			}
		}
		System.out.println(sum);
	}		
}
/*****************OUT PUT****************
34
6is a perfect number
28is a perfect number
496is a perfect number
8128is a perfect number
*/