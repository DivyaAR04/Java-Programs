package javaPractice;

public class For_While1 {
/* Given a non-negative number n, return the count of occurence of 7 as a digit,
 * so for example 717 yields 2.
 * 717-->2
 * 
 * 
 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int n=71777712;
		int count=0;
		int r=0;
		while(n!=0)
		{
			r = n%10;
			if(r==7)
			{
				count=count+1;
			}
			n=n/10;
		}
		System.out.println(count);
	}

}
