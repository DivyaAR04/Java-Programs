package javaPractice;
/*  +++++++++++++++++++++++++++ FINDING SUM OF GIVEN NUMBER DIGITS+++++++++++++++++++++++ */
public class For_While {
/*Given a non-negative int n, return the sum of its digits
 * sumDigits(126)->9
 * SumDigits(49)->13
 * sumDigits(12)->3
 * 
 * 
 */
	public static void main(String[] args) 
	{
		/*// TODO Auto-generated method stub
		int n=126;
		int res=0;
		int rem=0;
		while(n!=0)
		{
			rem=n%10;
			n=n/10;
			res=res+rem;
		}
		System.out.println(res);*/
		
		
		int n=49;
		int r=0;
		int sum=0;
		while(n!=0)
		{
			r=n%10;
			sum=sum+r;
			n=n/10;
			
			
		}
	}

}
