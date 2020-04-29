package javaPractice;

public class Fibbonaci_method 
{
	public static void isFibo(int a,int b,int count)
	{
	//	System.out.println(a);
	//	System.out.println(b);
		/* if you are printing the a value immidiately after the 
		 * while loop should be (count>0) or else 
		 * while loop should be (count>2)
		 */
		while(count>0)
		{
			System.out.println(a);
			int c=a+b;
	//		System.out.println(c);
			a=b;
			b=c;
			count--;
		}
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		isFibo(0,1,10);
	}

}
