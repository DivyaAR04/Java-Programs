package javaPractice;

public class Recursion4 
{
	//987654321
	public static void print(int a,int b)
	{
		if(a>=1)
		{
			System.out.println(a);
			a--;
			print(a,b);
		}
		else if(b<=9)
		{
			System.out.println(b);
			b++;
			print(a,b);
		}
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		print(9,2);
	}

}
