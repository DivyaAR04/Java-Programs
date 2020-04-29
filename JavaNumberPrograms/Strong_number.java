package javaPractice;
/*
 * 145=1!+4!+5!=1+24+120=145
 *
 *1. extract each digit using===>num%10
 *2. calculate the factorial of extracted number
 *3. store the factorial in a variable
 *4. eliminate last digit from the number===>num=num/10
 *5. repeat the step 1 to 4, till number==0
 *6. display the answer
 */
public class Strong_number 
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
	
	public static void main(String[] args)
	{
		int num =220;
		int r=0;
		int strong=0;
		int copy=num;
			
		while(num!=0)
		{
			r=num%10;
			System.out.println(r);
			strong=strong + factor(r);
			System.out.println(strong);
			num=num/10;
		}
		
		if(strong==copy)
		{
			System.out.println("strong number is "+strong);
		}
		else
		{
			System.out.println("it is not strong number");
		}
	
	}

}
