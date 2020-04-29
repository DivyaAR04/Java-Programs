package javaPractice;

public class Fibonacci_Recursion 
{
    static int a=0,b=1,c=0;
    static void fabseries(int num)
    {
    	if(num>0)
    	{
    		c=a+b;
    		a=b;
    		b=c;
    		System.out.println(c);
    		fabseries(num-1);
    	}
    		
    }
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println(a);
		System.out.println(b);
		fabseries(8);
	}
}

/************OUT PUT*************
0
1
1
2
3
5
8
13
21
34
*/