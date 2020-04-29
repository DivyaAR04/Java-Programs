package javaPractice;

public class Recursion2 {
	public static void test(int a)
	{
		if(a<=10)
		{
		System.out.println(a);
		a++;
		test(a);
		}
	}
	
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		test(1);
	}

}
